package com.woowahan.qa.study.test;

import com.woowahan.qa.study.ArithmeticOperation;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {

    private static ArithmeticOperation addition;

    @BeforeClass
    public static void setUp() {
     /**
        addition = new ArithmeticOperation() {
            @Override
            public double operate(double x, double y) {
                return x + y;
            }
        };

        위 익명 클래스 생성 코드는 아래 lambda 식 코드와 같은(?) 의미!!
     */
        addition = (x, y) -> x + y;
    }

    @Test
    public void _0보다_큰_두_수의_덧셈확인() {
        assertEquals("3 + 3 = 6", 6, (int) addition.operate(3, 3));
    }

    @Test
    public void _0보다_작은_두_수의_덧셈확인() {
        assertEquals("-3 + -3 = -6", -6, (int) addition.operate(-3, -3));
    }

    @Test
    public void _0보다_작은_유리수와_0보다_큰_정수의_덧셈확인() {
        assertEquals("-3.3 + 3 = -0.3", -0.3d, Double.parseDouble(String.format("%.1f", addition.operate(-3.3, 3))), 1.1);
    }

    @Test
    public void _0과_0의_덧셈확인() {
        assertEquals("0 + 0 = 0", 0, (int) addition.operate(0, 0));
    }

    @Test
    public void _0보다_매우_큰_두_수의_덧셈확인() {
        assertEquals("123456789 + 987654321 = 1111111110", 1111111110, (int) addition.operate(123456789, 987654321));
    }

    @AfterClass
    public static void tearDown() {
        addition = null;
    }

}
