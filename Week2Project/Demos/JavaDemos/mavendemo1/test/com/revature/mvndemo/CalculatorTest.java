package com.revature.mvndemo;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private static final Calculator calculator = new Calculator();

    @Test
    public void testAdd1() {
        int num1 = 10;
        int num2 = 20;
        int result = calculator.add(num1, num2);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testAdd2() {
        int num1 = 10;
        int num2 = 20;
        int result = calculator.add(num1, num2);
        Assertions.assertNotEquals(25, result);
    }

    @Test
    public void testSubtract1() {
        int num1 = 60;
        int num2 = 15;
        int result = calculator.subtract(num1, num2);
        Assertions.assertEquals(45, result);
    }
}
