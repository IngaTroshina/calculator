package com.calculator.calculator.Service;

import com.calculator.calculator.Exception.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationsTest {
    private final Calculations calculations = new Calculations();

    @Test
    public void shouldReturn10When5Plus5() {
        int result = calculations.plus(5,5);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void shouldReturn65When32Plus33() {
        int result = calculations.plus(32,33);
        Assertions.assertEquals(65, result);
    }
    @Test
    public void shouldReturn0When5Minus5() {
        int result = calculations.minus(5,5);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void shouldReturn167When235Minus68() {
        int result = calculations.minus(235,68);
        Assertions.assertEquals(167, result);
    }
    @Test
    public void shouldReturn25When5Multiply5() {
        int result = calculations.multiply(5,5);
        Assertions.assertEquals(25, result);
    }
    @Test
    public void shouldReturn78952When139Multiply568() {
        int result = calculations.multiply(139,568);
        Assertions.assertEquals(78952, result);
    }
    @Test
    public void shouldReturn1When5Divide5() {
        int result = calculations.divide(5,5);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void shouldReturn6496When25984Divide4() {
        int result = calculations.divide(25984,4);
        Assertions.assertEquals(6496, result);
    }
    @Test
    public void shouldThrowExceptionWhenDivideBy0() {
        Assertions.assertThrows(DivisionByZeroException.class, ()-> calculations.divide(5,0));
    }
}
