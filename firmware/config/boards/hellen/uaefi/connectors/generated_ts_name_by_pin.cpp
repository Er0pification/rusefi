//DO NOT EDIT MANUALLY, let automation work hard.

// auto-generated by PinoutLogic.java based on config/boards/hellen/uaefi/connectors/A.yaml
// auto-generated by PinoutLogic.java based on config/boards/hellen/uaefi/connectors/B.yaml
// auto-generated by PinoutLogic.java based on config/boards/hellen/uaefi/connectors/C.yaml
// auto-generated by PinoutLogic.java based on config/boards/hellen/uaefi/connectors/D.yaml
// auto-generated by PinoutLogic.java based on config/boards/hellen/uaefi/connectors/E.yaml
#include "pch.h"

// see comments at declaration in pin_repository.h
const char * getBoardSpecificPinName(brain_pin_e brainPin) {
	switch(brainPin) {
		case Gpio::A6: return "D10 BUTTON2";
		case Gpio::A8: return "B1 injector output 6";
		case Gpio::A9: return "B5 injector output 2";
		case Gpio::B1: return "D2 BUTTON1";
		case Gpio::B8: return "B10 Coil 6";
		case Gpio::B9: return "B9 Main Relay Weak Low Side output 1";
		case Gpio::C13: return "B15 Coil 1";
		case Gpio::C6: return "B16 Low Side output 4 / Fuel Pump Relay";
		case Gpio::D10: return "B3 injector output 4";
		case Gpio::D11: return "B4 injector output 3";
		case Gpio::D12: return "B18 VVT2 or Idle or Low Side output 2";
		case Gpio::D13: return "B17 Low Side output 3";
		case Gpio::D15: return "B7 VVT1 or Low Side output 1";
		case Gpio::D2: return "B2 injector output 5";
		case Gpio::D3: return "B6 injector output 1";
		case Gpio::E0: return "C18 VR1+ Discrete";
		case Gpio::E1: return "C17 VR2-/HALL max9924";
		case Gpio::E11: return "D5 FLEX";
		case Gpio::E12: return "C5 HALL1";
		case Gpio::E13: return "C6 HALL2";
		case Gpio::E14: return "C7 HALL3";
		case Gpio::E15: return "C9 BUTTON3";
		case Gpio::E2: return "B13 Coil 5";
		case Gpio::E3: return "B11 Coil 4";
		case Gpio::E4: return "B12 Coil 3";
		case Gpio::E5: return "B14 Coil 2";
		case Gpio::E6: return "B8 Fan Relay Weak Low Side output 2";
		default: return nullptr;
	}
	return nullptr;
}
