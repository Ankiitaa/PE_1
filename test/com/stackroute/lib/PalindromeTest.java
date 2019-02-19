package com.stackroute.lib;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindrome() {
        String expected="Success";
        Palindrome p=new Palindrome();
        String actual=p.palindrome(88866888);
        assertEquals(expected,actual);
    }
    @Test
    public void palindrome2() {
        String expected="Success";
        Palindrome p=new Palindrome();
        String actual=p.palindrome(121);
        assertNotEquals(expected,actual);
    }
}