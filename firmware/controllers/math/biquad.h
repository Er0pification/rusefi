/*
 * @file biquad.h
 *
 * @date Sep 10, 2016
 * @author Andrey Belomutskiy, (c) 2012-2016
 */

#ifndef CONTROLLERS_MATH_BIQUAD_H_
#define CONTROLLERS_MATH_BIQUAD_H_

class Biquad {
public:
    Biquad();
    void initValue(float input);
    float getValue(float input);

    float a0, a1, a2, b1, b2;
    float z1, z2;
};

#endif /* CONTROLLERS_MATH_BIQUAD_H_ */
