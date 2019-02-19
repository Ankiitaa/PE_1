package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void vowelConsonant() {
        String expected="vowel consonant ";
        VowelConsonant vc=new VowelConsonant();
        String actual=vc.vowelConsonant("ap");
        assertEquals(expected,actual);
    }
    @Test
    public void vowelConsonant2() {
        String expected="vowel consonant";
        VowelConsonant vc=new VowelConsonant();
        String actual=vc.vowelConsonant("aa");
        assertNotEquals(expected,actual);
    }
}