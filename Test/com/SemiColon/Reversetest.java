package com.SemiColon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Reversetest {

    @Test

    public void testForFactorialOfInteger() {
        Reverse reverse = new Reverse();
        reverse.findFactorialOfInt(5);
        assertEquals(6, reverse.findFactorialOfInt(3));

    }




}
