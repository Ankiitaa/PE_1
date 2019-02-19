package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tomAndJerry() {
        String expected="Tom";
        TomAndJerry tj=new TomAndJerry();
        String actual=tj.tomAndJerry(22);
        assertEquals(expected,actual);
    }
    @Test
    public void tomAndJerry2() {
        String expected="Tom";
        TomAndJerry tj=new TomAndJerry();
        String actual=tj.tomAndJerry(23);
        assertNotEquals(expected,actual);
    }
}