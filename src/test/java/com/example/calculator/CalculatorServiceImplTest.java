package com.example.calculator;

import exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne() {
        int result = calculatorService.plus(Constants.one, Constants.one);
        assertEquals(Constants.one + Constants.one, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne() {
        int result = calculatorService.plus(Constants.two, Constants.one);
        assertEquals(Constants.two + Constants.one, result);
    }

    @Test
    public void shouldReturnOneWhenSubtractTwoAndOne() {
        int result = calculatorService.minus(Constants.two, Constants.one);
        assertEquals(Constants.two - Constants.one, result);
    }

    @Test
    public void shouldReturnZeroWhenSubtractOneAndOne() {
        int result = calculatorService.minus(Constants.one, Constants.one);
        assertEquals(Constants.one - Constants.one, result);
    }
    @Test
    public void shouldReturnTwoWhenMultipleTwoAndOne() {
        int result = calculatorService.multiple(Constants.two, Constants.one);
        assertEquals(Constants.two * Constants.one, result);
    }
    @Test
    public void shouldReturnOneWhenMultipleOneAndOne() {
        int result = calculatorService.multiple(Constants.one, Constants.one);
        assertEquals(Constants.one * Constants.one, result);
    }
    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne() {
        double result = calculatorService.divide(Constants.two, Constants.one);
        assertEquals(Constants.two / Constants.one, result);
    }
    @Test
    public void shouldReturnZeroWhenDivideOneAndOne() {
        double result = calculatorService.divide(Constants.one, Constants.one);
        assertEquals(Constants.one / Constants.one, result);
    }
    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero(){
        assertThrows(DivisionByZeroException.class,() -> calculatorService.divide(Constants.one,Constants.zero));
    }
}