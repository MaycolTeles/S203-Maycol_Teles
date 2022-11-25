package com.inatel.arquitetura;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LogManager2Test {

    @Test
    public void deveTerApenasUmaInstancia() {
        LogManager2 logManagerSingleton = LogManager2.getInstance();

        assertNotNull(logManagerSingleton);

        LogManager2 logManagerSingleton2 = LogManager2.getInstance();

        assertNotNull(logManagerSingleton2);

        assertEquals(logManagerSingleton, logManagerSingleton2);
    }

}