package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void characterCheck() {
        String expected="Upper Case";
        CharacterCheck cc=new CharacterCheck();
        String actual=cc.characterCheck('A');
        assertEquals(expected,actual);
    }

    @Test
    public void characterCheck2() {
        String expected="Upper Case";
        CharacterCheck cc=new CharacterCheck();
        String actual=cc.characterCheck('a');
        assertNotEquals(expected,actual);
    }
}