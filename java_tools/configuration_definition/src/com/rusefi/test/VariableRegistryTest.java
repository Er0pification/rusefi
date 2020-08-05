package com.rusefi.test;

import com.rusefi.VariableRegistry;
import org.junit.Test;

import static com.rusefi.VariableRegistry._16_HEX_SUFFIX;
import static com.rusefi.VariableRegistry._HEX_SUFFIX;
import static org.junit.Assert.assertEquals;

/**
 * 3/30/2015
 */
public class VariableRegistryTest {
    @Test
    public void testReplace() {
        VariableRegistry.INSTANCE.clear();

        VariableRegistry.INSTANCE.register("var", 256);

        // trivial key-value substitution
        assertEquals("256", VariableRegistry.INSTANCE.applyVariables("@@var@@"));
        assertEquals("ab256", VariableRegistry.INSTANCE.applyVariables("ab@@var@@"));
        assertEquals("ab256cd", VariableRegistry.INSTANCE.applyVariables("ab@@var@@cd"));
        // both decimal and hex values here
        assertEquals("aa256qwe100fff", VariableRegistry.INSTANCE.applyVariables("aa@@var@@qwe@@var" + _HEX_SUFFIX + "@@fff"));

        assertEquals("\\x01\\x00", VariableRegistry.INSTANCE.applyVariables("@@var" + _16_HEX_SUFFIX + "@@"));
    }
}
