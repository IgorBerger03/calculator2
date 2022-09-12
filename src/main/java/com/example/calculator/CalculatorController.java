package com.example.calculator;

import jdk.jfr.DataAmount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    private String plus;
    private String minus;
    private String multiple;
    private String divide;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator(){
        return "Добро пожаловать в калькулятор.";
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        if(a == null || b == null){
            return "Неверно передано значение";
        }
        int plus = calculatorService.plus(a, b);
        return a + " + " + b + " = " + plus;
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        if(a == null || b == null){
            return "Неверно передано значение";
        }
        int minus = calculatorService.minus(a, b);
        return a + " - " + b + " = " + minus;
    }
    @GetMapping(path = "/calculator/multiple")
    public String multiple(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        if(a == null || b == null){
            return "Неверно передано значение";
        }
        int multiple = calculatorService.multiple(a, b);
        return a + " * " + b + " = " + multiple;
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {
        if(a == null || b == null){
            return "Неверно передано значение";
        }
        double divide = calculatorService.divide(a, b);
        return a + " / " + b + " = " + divide;
    }

}
