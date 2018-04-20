package com.woowahan.qa.study.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdditionTest.class,
        SubtractionTest.class,
        MultiplicationTest.class,
        DivisionTest.class,
        ArithmeticOperationIntegrationTest.class
})

public class ArithmeticOperationTestSuite {
}
