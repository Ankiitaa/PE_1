package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void total() {
        int expected=12;
        Total t=new Total();
        int actual=t.total(12,0);
        assertEquals(expected,actual);
    }
    @Test
    public void total2() {
        int expected=22;
        Total t=new Total();
        int actual=t.total(12,0);
        assertNotEquals(expected,actual);
    }

}