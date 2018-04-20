package com.woowahan.qa.study.test;

import com.woowahan.qa.study.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationIntegrationTest {

    private static ArithmeticOperation addition;
    private static ArithmeticOperation subtraction;
    private static ArithmeticOperation multiplication;
    private static ArithmeticOperation division;

    @BeforeClass
    public static void setUp() {
        addition = (double x, double y) -> x + y;
        subtraction = (double x, double y) -> x - y;
        multiplication = (double x, double y) -> x * y;
        division = (double x, double y) -> x / y;
    }

    @Test
    public void 사칙연산통합테스트() {
        assertEquals("(1 + 2) * 10 / 6 - 5 = 0", 0, (int) subtraction.operate(division.operate((int)multiplication.operate((int)addition.operate(1, 2), 10), 6), 5));
    }

    @AfterClass
    public static void tearDown() {
        addition = null;
        subtraction = null;
        multiplication = null;
        division = null;
    }
}
