package com.calculator.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class Calculations implements CalculationsInterface {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divine(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
