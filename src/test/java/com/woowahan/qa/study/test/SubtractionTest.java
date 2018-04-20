package com.woowahan.qa.study.test;

import com.woowahan.qa.study.ArithmeticOperation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {

    private static ArithmeticOperation subtraction;

    @BeforeClass
    public static void setUp() {
        subtraction = (double x, double y) -> x / y;
    }

    @Test
    public void _0보다_큰_두_수의_뺏셈확인() {
        assertEquals("6 - 3 = 3", 3, (int) subtraction.operate(6, 3));
    }

    @Test
    public void _0보다_작은_두_수의_뺄셈확인() {
        assertEquals("-3 - -3 = 0", 0, (int) subtraction.operate(-3, -3));
    }

    @Test
    public void _0보다_작은_유리수와_0보다_큰_정수의_뺄셈확인() {
        assertEquals("-3.3 - 3 = -6.3", -6.3, Double.parseDouble(String.format("%.1f", subtraction.operate(-3.3, 3))), 0.1);
    }

    @Test
    public void _0과_0의_뺄셈확인() {
        assertEquals("0 - 0 = 0", 0, (int) subtraction.operate(0, 0));
    }

    @Test
    public void _0보다_매우_작은_두_수의_덧셈확인() {
        assertEquals("-123456789 - 987654321 = -11111111110", -1111111110, subtraction.operate(-123456789, 987654321), Double.POSITIVE_INFINITY);
    }

    @AfterClass
    public static void tearDown() {
        subtraction = null;
    }
}
