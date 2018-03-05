/*
 * test_startOfCrankingPrimingPulse.cpp
 *
 *  Created on: Mar 4, 2018
 * @author Andrey Belomutskiy, (c) 2012-2018
 */

#include "test_startOfCrankingPrimingPulse.h"
#include "test_trigger_decoder.h"
#include "event_queue.h"
#include "unit_test_framework.h"

extern EventQueue schedulingQueue;
extern int timeNowUs;
extern EnginePins enginePins;

void testPlainCrankingWithoutAdvancedFeatures() {
	// this is just a reference unit test implementation
	printf("*************************************************** testPlainCrankingWithoutAdvancedFeatures\r\n");

	EngineTestHelper eth(TEST_ENGINE);
	EXPAND_EngineTestHelper

	setupSimpleTestEngineWithMafAndTT_ONE_trigger(&eth);
	assertEqualsM("RPM=0", 0, engine->rpmCalculator.getRpm(PASS_ENGINE_PARAMETER_SIGNATURE));

	eth.fireTriggerEvents2(1, MS2US(200));
	// still no RPM since need to cycles measure cycle duration
	assertEqualsM("RPM#1", 0, engine->rpmCalculator.getRpm(PASS_ENGINE_PARAMETER_SIGNATURE));

	timeNowUs += MS2US(200);
	eth.firePrimaryTriggerRise();
	assertEqualsM("RPM#2", 300, engine->rpmCalculator.getRpm(PASS_ENGINE_PARAMETER_SIGNATURE));
	// two simultaneous injections
	assertEqualsM("plain#2", 4, schedulingQueue.size());

//	assertEvent("sim start", 0, (void*)startSimultaniousInjection, timeNowUs, 97975, engine);
//	assertEvent("sim end", 1, (void*)endSimultaniousInjection, timeNowUs, 100000, 3);
}


void testStartOfCrankingPrimingPulse() {
	printf("*************************************************** testStartOfCrankingPrimingPulse\r\n");

	EngineTestHelper eth(TEST_ENGINE);
	EXPAND_EngineTestHelper

	engineConfiguration->startOfCrankingPrimingPulse = 4;

	setupSimpleTestEngineWithMafAndTT_ONE_trigger(&eth);
	assertEqualsM("RPM=0", 0, engine->rpmCalculator.getRpm(PASS_ENGINE_PARAMETER_SIGNATURE));
}

