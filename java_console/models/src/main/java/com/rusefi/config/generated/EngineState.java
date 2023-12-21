package com.rusefi.config.generated;

// this file was generated automatically by rusEFI tool config_definition_base.jar based on (unknown script) controllers/algo/engine_state.txt Thu Dec 21 05:28:46 UTC 2023

// by class com.rusefi.output.FileJavaFieldsConsumer
import com.rusefi.config.*;

public class EngineState {
	public static final int BANKS_COUNT = 2;
	public static final int BOOST_BLEND_COUNT = 2;
	public static final int CAM_INPUTS_COUNT = 4;
	public static final int CAMS_PER_BANK = 2;
	public static final int EGT_CHANNEL_COUNT = 8;
	public static final String GAUGE_CATEGORY_BOOST_CONTROL = "Boost Control";
	public static final String GAUGE_CATEGORY_ETB = "ETB more";
	public static final String GAUGE_CATEGORY_FUEL_MATH = "Fuel: math";
	public static final String GAUGE_CATEGORY_SYNC = "Sync";
	public static final String GAUGE_CATEGORY_TIMING = "Timing";
	public static final String GAUGE_COIL_DWELL_TIME = "Ignition: coil charge time";
	public static final String GAUGE_NAME_ACCEL_LAT = "Accel: Lateral";
	public static final String GAUGE_NAME_ACCEL_LON = "Accel: Longitudinal";
	public static final String GAUGE_NAME_ACCEL_VERT = "Accel: Vertical";
	public static final String GAUGE_NAME_ADJUSTED_TIMING = "Timing: ignition";
	public static final String GAUGE_NAME_AFR = "Air/Fuel Ratio";
	public static final String GAUGE_NAME_AFR2 = "Air/Fuel Ratio 2";
	public static final String GAUGE_NAME_AFR2_GAS_SCALE = "Air/Fuel Ratio 2 (Gas Scale)";
	public static final String GAUGE_NAME_AFR_GAS_SCALE = "Air/Fuel Ratio (Gas Scale)";
	public static final String GAUGE_NAME_AIR_FLOW_ESTIMATE = "Air: Flow estimate";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED = "MAF";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED_2 = "MAF #2";
	public static final String GAUGE_NAME_AIR_MASS = "Air: Cylinder airmass";
	public static final String GAUGE_NAME_AUX_LINEAR_1 = "Aux linear #1";
	public static final String GAUGE_NAME_AUX_LINEAR_2 = "Aux linear #2";
	public static final String GAUGE_NAME_AUX_TEMP1 = "Aux temp 1";
	public static final String GAUGE_NAME_AUX_TEMP2 = "Aux temp 2";
	public static final String GAUGE_NAME_BARO_PRESSURE = "Barometric pressure";
	public static final String GAUGE_NAME_BOOST_CLOSED_LOOP = "Boost: Closed loop";
	public static final String GAUGE_NAME_BOOST_OPEN_LOOP = "Boost: Open loop";
	public static final String GAUGE_NAME_BOOST_OUTPUT = "Boost: Output";
	public static final String GAUGE_NAME_BOOST_TARGET = "Boost: Target";
	public static final String GAUGE_NAME_CAN_READ_OK = "CAN: Rx";
	public static final String GAUGE_NAME_CAN_WRITE_ERR = "CAN: Tx err";
	public static final String GAUGE_NAME_CAN_WRITE_OK = "CAN: Tx OK";
	public static final String GAUGE_NAME_CLT = "CLT";
	public static final String GAUGE_NAME_CPU_TEMP = "CPU Temperature";
	public static final String GAUGE_NAME_CURRENT_GEAR = "Current Gear";
	public static final String GAUGE_NAME_DEBUG_F1 = "debug f1";
	public static final String GAUGE_NAME_DEBUG_F2 = "debug f2: iTerm";
	public static final String GAUGE_NAME_DEBUG_F3 = "debug f3: prevError";
	public static final String GAUGE_NAME_DEBUG_F4 = "debug f4: iParam";
	public static final String GAUGE_NAME_DEBUG_F5 = "debug f5: dParam";
	public static final String GAUGE_NAME_DEBUG_F6 = "debug f6: dTerm";
	public static final String GAUGE_NAME_DEBUG_F7 = "debug f7";
	public static final String GAUGE_NAME_DEBUG_I1 = "debug i1: pParam";
	public static final String GAUGE_NAME_DEBUG_I2 = "debug i2: offset";
	public static final String GAUGE_NAME_DEBUG_I3 = "debug i3";
	public static final String GAUGE_NAME_DEBUG_I4 = "debug i4";
	public static final String GAUGE_NAME_DEBUG_I5 = "debug i5";
	public static final String GAUGE_NAME_DESIRED_GEAR = "TCU: Desired Gear";
	public static final String GAUGE_NAME_DETECTED_GEAR = "Detected Gear";
	public static final String GAUGE_NAME_DWELL_DUTY = "Ignition: coil duty cycle";
	public static final String GAUGE_NAME_ECU_TEMPERATURE = "ECU temperature";
	public static final String GAUGE_NAME_ENGINE_CRC16 = "Engine CRC16";
	public static final String GAUGE_NAME_ETB_DUTY = "ETB: Duty";
	public static final String GAUGE_NAME_ETB_ERROR = "ETB: position error";
	public static final String GAUGE_NAME_ETB_TARGET = "ETB: position target";
	public static final String GAUGE_NAME_FLEX = "Flex Ethanol %";
	public static final String GAUGE_NAME_FUEL_BARO_CORR = "Fuel: Barometric pressure mult";
	public static final String GAUGE_NAME_FUEL_BASE = "Fuel: base cycle mass";
	public static final String GAUGE_NAME_FUEL_CHARGE_TEMP = "Fuel: Estimated charge temperature";
	public static final String GAUGE_NAME_FUEL_CLT_CORR = "Fuel: CLT correction";
	public static final String GAUGE_NAME_FUEL_CONSUMPTION = "Fuel: Total consumed";
	public static final String GAUGE_NAME_FUEL_CRANKING = "Fuel: cranking";
	public static final String GAUGE_NAME_FUEL_FLOW = "Fuel: Flow rate";
	public static final String GAUGE_NAME_FUEL_IAT_CORR = "Fuel: IAT correction";
	public static final String GAUGE_NAME_FUEL_INJ_DUTY = "Fuel: injector duty cycle";
	public static final String GAUGE_NAME_FUEL_INJECTION_TIMING = "Fuel: Injection timing SOI";
	public static final String GAUGE_NAME_FUEL_LAST_INJECTION = "Fuel: Last inj pulse width";
	public static final String GAUGE_NAME_FUEL_LEVEL = "Fuel level";
	public static final String GAUGE_NAME_FUEL_LOAD = "Fuel: Load";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH = "Fuel pressure (high)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH_UNITS = "bar";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW = "Fuel pressure (low)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW_UNITS = "kPa";
	public static final String GAUGE_NAME_FUEL_RUNNING = "Fuel: running";
	public static final String GAUGE_NAME_FUEL_TEMPERATURE = "Fuel Temperature";
	public static final String GAUGE_NAME_FUEL_TPS_EXTRA = "Fuel: TPS AE add fuel ms";
	public static final String GAUGE_NAME_FUEL_TRIM = "Fuel: fuel trim";
	public static final String GAUGE_NAME_FUEL_TRIM_2 = "Fuel: fuel trim 2";
	public static final String GAUGE_NAME_FUEL_VE = "Fuel: VE";
	public static final String GAUGE_NAME_FUEL_WALL_AMOUNT = "Fuel: wall amount";
	public static final String GAUGE_NAME_FUEL_WALL_CORRECTION = "Fuel: wall correction";
	public static final String GAUGE_NAME_FW_VERSION = "ECU Software Version";
	public static final String GAUGE_NAME_GEAR_RATIO = "Gearbox Ratio";
	public static final String GAUGE_NAME_GYRO_YAW = "Gyro: Yaw rate";
	public static final String GAUGE_NAME_IAC = "Idle: Position";
	public static final String GAUGE_NAME_IAT = "IAT";
	public static final String GAUGE_NAME_IDLE_POSITION = "Idle: Position sensor";
	public static final String GAUGE_NAME_IGNITION_LOAD = "Ignition: load";
	public static final String GAUGE_NAME_IGNITION_MODE = "Ignition: Mode";
	public static final String GAUGE_NAME_INJECTION_MODE = "Fuel: Injection mode";
	public static final String GAUGE_NAME_INJECTOR_LAG = "Fuel: injector lag";
	public static final String GAUGE_NAME_ISS = "TCU: Input Shaft Speed";
	public static final String GAUGE_NAME_KNOCK_COUNTER = "Knock: Count";
	public static final String GAUGE_NAME_KNOCK_LEVEL = "Knock: Current level";
	public static final String GAUGE_NAME_KNOCK_RETARD = "Knock: Retard";
	public static final String GAUGE_NAME_LAMBDA = "Lambda";
	public static final String GAUGE_NAME_LAMBDA2 = "Lambda 2";
	public static final String GAUGE_NAME_LAST_ERROR = "Last error";
	public static final String GAUGE_NAME_MAF = "MAF";
	public static final String GAUGE_NAME_MAP = "MAP";
	public static final String GAUGE_NAME_OIL_PRESSURE = "Oil Pressure";
	public static final String GAUGE_NAME_OIL_PRESSURE_UNITS = "kPa";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_HIGH = "Fuel pressure raw (high)";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_LOW = "Fuel pressure raw (low)";
	public static final String GAUGE_NAME_RPM = "RPM";
	public static final String GAUGE_NAME_TARGET_AFR = "Fuel: target AFR";
	public static final String GAUGE_NAME_TARGET_LAMBDA = "Fuel: target lambda";
	public static final String GAUGE_NAME_TC_RATIO = "TCU: Torque Converter Ratio";
	public static final String GAUGE_NAME_TCHARGE = "Air: SD tCharge";
	public static final String GAUGE_NAME_THROTTLE_PEDAL = "Throttle pedal position";
	public static final String GAUGE_NAME_TIME = "Time";
	public static final String GAUGE_NAME_TIMING_ADVANCE = "Ignition: Timing";
	public static final String GAUGE_NAME_TPS = "TPS";
	public static final String GAUGE_NAME_TPS2 = "TPS2";
	public static final String GAUGE_NAME_TRG_ERR = "Trigger Error Counter";
	public static final String GAUGE_NAME_TRG_GAP = "Trigger Sync Latest Ratio";
	public static final String GAUGE_NAME_TUNE_CRC16 = "Tune CRC16";
	public static final String GAUGE_NAME_TURBO_SPEED = "Turbocharger Speed";
	public static final String GAUGE_NAME_UPTIME = "Uptime";
	public static final String GAUGE_NAME_VBAT = "VBatt";
	public static final String GAUGE_NAME_VERSION = "firmware";
	public static final String GAUGE_NAME_VVS = "Vehicle Speed";
	public static final String GAUGE_NAME_VVT_B1E = "VVT: bank 1 exhaust";
	public static final String GAUGE_NAME_VVT_B1I = "VVT: bank 1 intake";
	public static final String GAUGE_NAME_VVT_B2E = "VVT: bank 2 exhaust";
	public static final String GAUGE_NAME_VVT_B2I = "VVT: bank 2 intake";
	public static final String GAUGE_NAME_VVT_TARGET_B1E = "VVT: bank 1 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B1I = "VVT: bank 1 intake target";
	public static final String GAUGE_NAME_VVT_TARGET_B2E = "VVT: bank 2 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B2I = "VVT: bank 2 intake target";
	public static final String GAUGE_NAME_WARNING_COUNTER = "Warning: counter";
	public static final String GAUGE_NAME_WARNING_LAST = "Warning: last";
	public static final String GAUGE_NAME_WG_POSITION = "Wastegate position sensor";
	public static final int IGN_BLEND_COUNT = 4;
	public static final String INDICATOR_NAME_AC_SWITCH = "AC switch";
	public static final String INDICATOR_NAME_BRAKE_DOWN = "Brake switch";
	public static final String INDICATOR_NAME_CLUTCH_DOWN = "Clutch: down";
	public static final String INDICATOR_NAME_CLUTCH_UP = "Clutch: up";
	public static final int LUA_ANALOG_INPUT_COUNT = 8;
	public static final int LUA_GAUGE_COUNT = 2;
	public static final int MAX_CYLINDER_COUNT = 12;
	public static final int PACK_ADD_TEMPERATURE = 40;
	public static final int PACK_MULT_AFR = 1000;
	public static final int PACK_MULT_AFR_CFG = 10;
	public static final int PACK_MULT_ANGLE = 50;
	public static final int PACK_MULT_FLEX = 2;
	public static final int PACK_MULT_FUEL_FLOW = 200;
	public static final int PACK_MULT_FUEL_MASS = 100;
	public static final int PACK_MULT_HIGH_PRESSURE = 10;
	public static final int PACK_MULT_LAMBDA = 10000;
	public static final int PACK_MULT_LAMBDA_CFG = 147;
	public static final int PACK_MULT_MASS_FLOW = 10;
	public static final int PACK_MULT_MS = 300;
	public static final int PACK_MULT_PERCENT = 100;
	public static final int PACK_MULT_PRESSURE = 30;
	public static final int PACK_MULT_TEMPERATURE = 100;
	public static final int PACK_MULT_VOLTAGE = 1000;
	public static final int PACK_MULT_VSS = 100;
	public static final int TCU_GEAR_COUNT = 10;
	public static final int TPS_2_BYTE_PACKING_MULT = 100;
	public static final int VE_BLEND_COUNT = 4;
	public static final Field LUA_FUELADD = Field.create("LUA_FUELADD", 0, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field LUA_FUELMULT = Field.create("LUA_FUELMULT", 4, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field LUA_CLUTCHUPSTATE = Field.create("LUA_CLUTCHUPSTATE", 8, FieldType.BIT, 0).setBaseOffset(1048);
	public static final Field LUA_BRAKEPEDALSTATE = Field.create("LUA_BRAKEPEDALSTATE", 8, FieldType.BIT, 1).setBaseOffset(1048);
	public static final Field LUA_ACREQUESTSTATE = Field.create("LUA_ACREQUESTSTATE", 8, FieldType.BIT, 2).setBaseOffset(1048);
	public static final Field LUA_LUADISABLEETB = Field.create("LUA_LUADISABLEETB", 8, FieldType.BIT, 3).setBaseOffset(1048);
	public static final Field LUA_LUAIGNCUT = Field.create("LUA_LUAIGNCUT", 8, FieldType.BIT, 4).setBaseOffset(1048);
	public static final Field SD_TCHARGE = Field.create("SD_TCHARGE", 12, FieldType.INT16).setScale(0.01).setBaseOffset(1048);
	public static final Field SD_ALIGNMENTFILL_AT_2 = Field.create("SD_ALIGNMENTFILL_AT_2", 14, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field SD_TCHARGEK = Field.create("SD_TCHARGEK", 16, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field CRANKINGFUEL_COOLANTTEMPERATURECOEFFICIENT = Field.create("CRANKINGFUEL_COOLANTTEMPERATURECOEFFICIENT", 20, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field CRANKINGFUEL_TPSCOEFFICIENT = Field.create("CRANKINGFUEL_TPSCOEFFICIENT", 24, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field CRANKINGFUEL_DURATIONCOEFFICIENT = Field.create("CRANKINGFUEL_DURATIONCOEFFICIENT", 28, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field CRANKINGFUEL_FUEL = Field.create("CRANKINGFUEL_FUEL", 32, FieldType.INT16).setScale(0.01).setBaseOffset(1048);
	public static final Field CRANKINGFUEL_ALIGNMENTFILL_AT_14 = Field.create("CRANKINGFUEL_ALIGNMENTFILL_AT_14", 34, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field BAROCORRECTION = Field.create("BAROCORRECTION", 36, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field HELLENBOARDID = Field.create("HELLENBOARDID", 40, FieldType.INT16).setScale(1.0).setBaseOffset(1048);
	public static final Field CLUTCHUPSTATE = Field.create("CLUTCHUPSTATE", 42, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field CLUTCHDOWNSTATE = Field.create("CLUTCHDOWNSTATE", 43, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field BRAKEPEDALSTATE = Field.create("BRAKEPEDALSTATE", 44, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field STARTSTOPSTATE = Field.create("STARTSTOPSTATE", 45, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field SMARTCHIPSTATE = Field.create("SMARTCHIPSTATE", 46, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field SMARTCHIPRESTARTCOUNTER = Field.create("SMARTCHIPRESTARTCOUNTER", 47, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field STARTSTOPPHYSICALSTATE = Field.create("STARTSTOPPHYSICALSTATE", 48, FieldType.BIT, 0).setBaseOffset(1048);
	public static final Field ACRSTATEDUP = Field.create("ACRSTATEDUP", 48, FieldType.BIT, 1).setBaseOffset(1048);
	public static final Field ACRENGINEMOVEDRECENTLY = Field.create("ACRENGINEMOVEDRECENTLY", 48, FieldType.BIT, 2).setBaseOffset(1048);
	public static final Field HEATERCONTROLENABLED = Field.create("HEATERCONTROLENABLED", 48, FieldType.BIT, 3).setBaseOffset(1048);
	public static final Field LUADIGITALSTATE0 = Field.create("LUADIGITALSTATE0", 48, FieldType.BIT, 4).setBaseOffset(1048);
	public static final Field LUADIGITALSTATE1 = Field.create("LUADIGITALSTATE1", 48, FieldType.BIT, 5).setBaseOffset(1048);
	public static final Field LUADIGITALSTATE2 = Field.create("LUADIGITALSTATE2", 48, FieldType.BIT, 6).setBaseOffset(1048);
	public static final Field LUADIGITALSTATE3 = Field.create("LUADIGITALSTATE3", 48, FieldType.BIT, 7).setBaseOffset(1048);
	public static final Field STARTSTOPSTATETOGGLECOUNTER = Field.create("STARTSTOPSTATETOGGLECOUNTER", 52, FieldType.INT).setScale(1.0).setBaseOffset(1048);
	public static final Field EGTVALUE1 = Field.create("EGTVALUE1", 56, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field EGTVALUE2 = Field.create("EGTVALUE2", 60, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field DESIREDRPMLIMIT = Field.create("DESIREDRPMLIMIT", 64, FieldType.INT16).setScale(1.0).setBaseOffset(1048);
	public static final Field ALIGNMENTFILL_AT_66 = Field.create("ALIGNMENTFILL_AT_66", 66, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field FUELINJECTIONCOUNTER = Field.create("FUELINJECTIONCOUNTER", 68, FieldType.INT).setScale(1.0).setBaseOffset(1048);
	public static final Field SPARKCOUNTER = Field.create("SPARKCOUNTER", 72, FieldType.INT).setScale(1.0).setBaseOffset(1048);
	public static final Field FUELINGLOAD = Field.create("FUELINGLOAD", 76, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field IGNITIONLOAD = Field.create("IGNITIONLOAD", 80, FieldType.FLOAT).setBaseOffset(1048);
	public static final Field VETABLEYAXIS = Field.create("VETABLEYAXIS", 84, FieldType.INT16).setScale(0.01).setBaseOffset(1048);
	public static final Field ALIGNMENTFILL_AT_86 = Field.create("ALIGNMENTFILL_AT_86", 86, FieldType.INT8).setScale(1.0).setBaseOffset(1048);
	public static final Field[] VALUES = {
	LUA_FUELADD,
	LUA_FUELMULT,
	LUA_CLUTCHUPSTATE,
	LUA_BRAKEPEDALSTATE,
	LUA_ACREQUESTSTATE,
	LUA_LUADISABLEETB,
	LUA_LUAIGNCUT,
	SD_TCHARGE,
	SD_ALIGNMENTFILL_AT_2,
	SD_TCHARGEK,
	CRANKINGFUEL_COOLANTTEMPERATURECOEFFICIENT,
	CRANKINGFUEL_TPSCOEFFICIENT,
	CRANKINGFUEL_DURATIONCOEFFICIENT,
	CRANKINGFUEL_FUEL,
	CRANKINGFUEL_ALIGNMENTFILL_AT_14,
	BAROCORRECTION,
	HELLENBOARDID,
	CLUTCHUPSTATE,
	CLUTCHDOWNSTATE,
	BRAKEPEDALSTATE,
	STARTSTOPSTATE,
	SMARTCHIPSTATE,
	SMARTCHIPRESTARTCOUNTER,
	STARTSTOPPHYSICALSTATE,
	ACRSTATEDUP,
	ACRENGINEMOVEDRECENTLY,
	HEATERCONTROLENABLED,
	LUADIGITALSTATE0,
	LUADIGITALSTATE1,
	LUADIGITALSTATE2,
	LUADIGITALSTATE3,
	STARTSTOPSTATETOGGLECOUNTER,
	EGTVALUE1,
	EGTVALUE2,
	DESIREDRPMLIMIT,
	ALIGNMENTFILL_AT_66,
	FUELINJECTIONCOUNTER,
	SPARKCOUNTER,
	FUELINGLOAD,
	IGNITIONLOAD,
	VETABLEYAXIS,
	ALIGNMENTFILL_AT_86,
	};
}
