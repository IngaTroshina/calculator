package com.calculator.calculator.Controller;

import com.calculator.calculator.Service.Calculations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final Calculations calculations;

    public Controller(Calculations calculations) {
        this.calculations = calculations;
    }

    @GetMapping
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    @GetMapping("/plus")
    public String plus(
        @RequestParam(name = "num1", required = false) Integer num1,
        @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null){
            return "Недостаточно данных. Пожалуйста, проверьте, что оба аргумента заданы корректно";
        }
        return num1 + " + " + num2 + " = " + calculations.plus(num1, num2).toString();
    }
    @GetMapping("/minus")
    public String minus(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null){
            return "Недостаточно данных. Пожалуйста, проверьте, что оба аргумента заданы корректно";
        }
        return num1 + " - " + num2 + " = " + calculations.minus(num1, num2).toString();
    }
    @GetMapping("/multiply")
    public String multiply(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null){
            return "Недостаточно данных. Пожалуйста, проверьте, что оба аргумента заданы корректно";
        }
        return num1 + " * " + num2 + " = " + calculations.multiply(num1, num2).toString();
    }
    @GetMapping("/divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Недостаточно данных. Пожалуйста, проверьте, что оба аргумента заданы корректно";
        } else if (num2.equals(0)) {
            return "Делить на 0 нельзя!";
        }
        return num1 + " / " + num2 + " = " + calculations.divine(num1, num2).toString();
    }
}
