package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void descend() {
        Descend d1=new Descend();
        String expected="success";

        String output=d1.descend(2266888);
        assertEquals(expected,output);
    }
    @Test
    public void descend2() {
        Descend d1=new Descend();
        String expected="success";

        String output=d1.descend(234);
        assertNotEquals(expected,output);
    }
}