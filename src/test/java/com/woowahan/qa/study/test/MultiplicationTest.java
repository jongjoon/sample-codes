package com.woowahan.qa.study.test;

import com.woowahan.qa.study.ArithmeticOperation;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    private static ArithmeticOperation multiplication;

    @BeforeClass
    public static void setUp() {
        multiplication = (double x, double y) -> x * y;
    }

    @Test
    public void _두_수가_모두_0_인_곱셈확인() {
        assertEquals("0 * 0 = 0", 0, (int) multiplication.operate(0, 0));
    }

    @Test
    public void _0보다_큰_정수와_0의_곱셈확인() {
        assertEquals("123456789 * 0 = 0", 0, (int) multiplication.operate(123456789, 0));
    }

    @Test
    public void _0보다_작은_정수와_0의_곱셈확인() {
        assertEquals("-123456789 * 0 = 0", 0, (int) multiplication.operate(-123456789, 0));
    }

    @Test
    public void _0보다_큰_두_정수의_곱셈확인() {
        assertEquals("2 * 1111111111 = 2222222222", 2222222222L, (long) multiplication.operate(2, 1111111111L));
    }

    @AfterClass
    public static void tearDown() {
        multiplication = null;
    }
}
