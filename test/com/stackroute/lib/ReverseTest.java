package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        String expected="atikna";
        Reverse r=new Reverse();
        String actual=r.reverse("ankita");
        assertEquals(expected,actual);
    }
    @Test
    public void reverse2() {
        String expected="atikn";
        Reverse r=new Reverse();
        String actual=r.reverse("ankita");
        assertNotEquals(expected,actual);
    }
}