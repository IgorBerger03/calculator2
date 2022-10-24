package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSumCorrectly(int a, int b) {
        int result = calculatorService.plus(a,b);
        assertEquals(a + b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldSubtractCorrectly(int a, int b) {
        int result = calculatorService.minus(a,b);
        assertEquals(a - b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultipleCorrectly(int a, int b) {
        int result = calculatorService.multiple(a,b);
        assertEquals(a * b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrectly(int a, int b) {
        int result = (int) calculatorService.divide(a,b);
        assertEquals(a / b, result);
    }


    private static Stream<Arguments> provideCalculatorParams() {
        return Stream.of(
                Arguments.of(Constants.one, Constants.two),
                Arguments.of(Constants.two, Constants.two),
                Arguments.of(Constants.zero, Constants.three)
        );
    }
}
