package com.woowahan.qa.study.test;

import com.woowahan.qa.study.ArithmeticOperation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.Double.*;
import static org.junit.Assert.assertEquals;

public class DivisionTest {

    private static ArithmeticOperation division;

    @BeforeClass
    public static void setUp() {
        division = (double x, double y) -> x / y;
    }

    @Test
    public void _피제수와_제수가_모두_0보다_큰_정수일때_나눗셈_확인() {
        assertEquals("10/2 = 5", 5, (int) division.operate(10, 2));
    }

    @Test
    public void _피제수와_제수가_모두_0보다_작은_정수일때_나눗셈_확인() {
        assertEquals("-10/-2 = 5", 5, (int) division.operate(-10, -2));
    }

    @Test
    public void _피제수와_제수가_모두_0보다_큰_유리수일때_나눗셈_확인() {
        assertEquals("100.08 / 2.0 = 50.04", 50.04, division.operate(100.08, 2.0));
    }

    @Test
    public void _피제수와_제수가_모두_0보다_작은_유리수일때_나눗셈_확인() {
        assertEquals("-100.08 / -2.0 = 50.04", 50.04, division.operate(-100.08, -2.0));
    }

    @Test
    public void _피제수가_0_제수가_0보다_큰_정수일때_나눗셈_확인() {
        assertEquals("0 / 1 = 0", 0, (int) division.operate(0, 1));
    }

    @Test
    public void _피제수와_제수가_모두_0일때_나눗셈_확인() {
        assertEquals("0 / 0 = 0", NaN, division.operate(0, 0));
    }

    @Test
    public void _피제수가_0보다_큰_정수이고_제수가_0일때_나눗셈_확인() {
        assertEquals("1 / 0 = ", POSITIVE_INFINITY, division.operate(1, 0));
    }

    @Test
    public void _피제수가_0보다_작은_정수이고_제수가_0일때_나눗셈_확인() {
        assertEquals("-1 / 0 = ", NEGATIVE_INFINITY, division.operate(-1, 0));
    }

    @Test
    public void _피제수가_10이고_제수가_3_일때_나눗셈_확인() {
        assertEquals("10/3 = 3.3333333333", 3.3333333333, Double.parseDouble(String.format("%.10f", division.operate(10, 3))));
    }

    @AfterClass
    public static void tearDown() {
        division = null;
    }

}
