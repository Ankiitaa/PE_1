package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void guess() {
        String expected="Guessed umber is greater than target";
        Guess g= new Guess();
        String actual=g.guess(89,78);
        assertEquals(expected,actual);

    }
    @Test
    public void guess2() {
        String expected="Guessed umber is greater than target";
        Guess g= new Guess();
        String actual=g.guess(89,89);
        assertNotEquals(expected,actual);

    }
}