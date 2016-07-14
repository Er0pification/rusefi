/**
 * @file    interpolation.h
 *
 * @date Oct 17, 2013
 * @author Andrey Belomutskiy, (c) 2012-2016
 */

#ifndef INTERPOLATION_3D_H_
#define INTERPOLATION_3D_H_

#include <math.h>
#include "datalogging.h"
#include "efilib.h"
#include "obd_error_codes.h"
#include "error_handling.h"

#define INTERPOLATION_A(x1, y1, x2, y2) ((y1 - y2) / (x1 - x2))

int findIndex(const float array[], int size, float value);
int findIndex2(const float array[], unsigned size, float value);
float interpolate(float x1, float y1, float x2, float y2, float x);
float interpolateMsg(const char *msg, float x1, float y1, float x2, float y2, float x);
float interpolate2d(float value, float bin[], float values[], int size);

int needInterpolationLogging(void);

/**
 * @brief	Two-dimensional table lookup with linear interpolation
 */
template<typename vType>
float interpolate3d(float x, float xBin[], int xBinSize, float y, float yBin[], int yBinSize, vType* map[]) {
	if (cisnan(x)) {
		warning(CUSTOM_OBD_14, "%f: x is NaN in interpolate3d", x);
		return NAN;
	}
	if (cisnan(y)) {
		warning(CUSTOM_OBD_13, "%f: y is NaN in interpolate3d", y);
		return NAN;
	}

	int xIndex = findIndex(xBin, xBinSize, x);
#if	DEBUG_INTERPOLATION
	if (needInterpolationLogging())
		printf("X index=%d\r\n", xIndex);
#endif
	int yIndex = findIndex(yBin, yBinSize, y);
	if (xIndex < 0 && yIndex < 0) {
#if	DEBUG_INTERPOLATION
		if (needInterpolationLogging())
			printf("X and Y are smaller than smallest cell in table: %d\r\n", xIndex);
#endif
		return map[0][0];
	}

	if (xIndex < 0) {
#if	DEBUG_INTERPOLATION
		if (needInterpolationLogging())
			printf("X is smaller than smallest cell in table: %dr\n", xIndex);
#endif
		if (yIndex == yBinSize - 1)
			return map[0][yIndex];
		float keyMin = yBin[yIndex];
		float keyMax = yBin[yIndex + 1];
		float rpmMinValue = map[0][yIndex];
		float rpmMaxValue = map[0][yIndex + 1];

		return interpolateMsg("3d", keyMin, rpmMinValue, keyMax, rpmMaxValue, y);
	}

	if (yIndex < 0) {
#if	DEBUG_INTERPOLATION
		if (needInterpolationLogging())
			printf("Y is smaller than smallest cell in table: %d\r\n", yIndex);
#endif
		// no interpolation should be fine here.
		return map[xIndex][0];
	}

	if (xIndex == xBinSize - 1 && yIndex == yBinSize - 1) {
#if	DEBUG_INTERPOLATION
		if (needInterpolationLogging())
			printf("X and Y are larger than largest cell in table: %d %d\r\n", xIndex, yIndex);
#endif
		return map[xBinSize - 1][yBinSize - 1];
	}

	if (xIndex == xBinSize - 1) {
#if	DEBUG_INTERPOLATION
		if (needInterpolationLogging())
			printf("TODO BETTER LOGGING x overflow %d\r\n", yIndex);
#endif
		// todo: implement better handling - y interpolation
		return map[xBinSize - 1][yIndex];
	}

	if (yIndex == yBinSize - 1) {
#if	DEBUG_INTERPOLATION
		if (needInterpolationLogging())
			printf("Y is larger than largest cell in table: %d\r\n", yIndex);
#endif
		// todo: implement better handling - x interpolation
		return map[xIndex][yBinSize - 1];
	}

	/*
	 * first we find the interpolated value for this RPM
	 */
	int rpmMaxIndex = xIndex + 1;

	float xMin = xBin[xIndex];
	float xMax = xBin[xIndex + 1];
	float rpmMinKeyMinValue = map[xIndex][yIndex];
	float rpmMaxKeyMinValue = map[xIndex + 1][yIndex];

	float keyMinValue = interpolate(xMin, rpmMinKeyMinValue, xMax, rpmMaxKeyMinValue, x);

#if	DEBUG_INTERPOLATION
	if (needInterpolationLogging()) {
		printf("X=%f:\r\nrange %f - %f\r\n", x, xMin, xMax);
		printf("X interpolation range %f   %f result %f\r\n", rpmMinKeyMinValue, rpmMaxKeyMinValue, keyMinValue);
	}
#endif

	int keyMaxIndex = yIndex + 1;
	float keyMin = yBin[yIndex];
	float keyMax = yBin[keyMaxIndex];
	float rpmMinKeyMaxValue = map[xIndex][keyMaxIndex];
	float rpmMaxKeyMaxValue = map[rpmMaxIndex][keyMaxIndex];

	float keyMaxValue = interpolateMsg("3d", xMin, rpmMinKeyMaxValue, xMax, rpmMaxKeyMaxValue, x);

#if	DEBUG_INTERPOLATION
	if (needInterpolationLogging()) {
		printf("key=%f:\r\nrange %f - %f\r\n", y, keyMin, keyMax);
		printf("key interpolation range %f   %f result %f\r\n", rpmMinKeyMaxValue, rpmMaxKeyMaxValue, keyMaxValue);
	}
#endif

	float result = interpolateMsg("3d", keyMin, keyMinValue, keyMax, keyMaxValue, y);
	return result;
}
void setTableValue(float bins[], float values[], int size, float key, float value);
void initInterpolation(Logging *sharedLogger);

class FastInterpolation {
public:
	FastInterpolation();
	FastInterpolation(float x1, float y1, float x2, float y2);
	void init(float x1, float y1, float x2, float y2);
	float getValue(float x);
private:
	float a, b;
};

#endif /* INTERPOLATION_3D_H_ */
