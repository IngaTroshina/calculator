package com.calculator.calculator.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculationsParameterizedTest {
    private final Calculations calculations = new Calculations();

    @ParameterizedTest
    @MethodSource("argumentsForPlusTests")
    public void shouldReturnPlus(int num1, int num2, int expected) {
        int result = calculations.plus(num1,num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> argumentsForPlusTests() {
        return Stream.of(
                Arguments.of(3,6,9),
                Arguments.of(50,25,75),
                Arguments.of(72648,721536,794184)
        );
    }

    @ParameterizedTest
    @CsvSource({"20,10,10", "63,9,54", "246504, 3,246501"})
    public void shouldReturnMinus(int num1, int num2, int expected) {
        int result = calculations.minus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"20,10,200", "63,9,567", "246504, 3,739512"})
    public void shouldReturnMultiply(int num1, int num2, int expected) {
        int result = calculations.multiply(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"20,10,2", "63,9,7", "246504, 3,82168"})
    public void shouldReturnDivide(int num1, int num2, int expected) {
        int result = calculations.divide(num1, num2);
        Assertions.assertEquals(expected, result);
    }
}
