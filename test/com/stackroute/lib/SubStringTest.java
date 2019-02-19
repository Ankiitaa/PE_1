package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubStringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void subString() {
        String expected="stackroutetete";
        SubString ss=new SubString();
        String actual=ss.subString("stackroute", 2);
        assertEquals(expected,actual);
    }
    @Test
    public void subString2() {
        String expected="stackroutetetete";
        SubString ss=new SubString();
        String actual=ss.subString("stckroute", 2);
        assertNotEquals(expected,actual);
    }
}