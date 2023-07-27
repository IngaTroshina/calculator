package com.calculator.calculator.Service;

import com.calculator.calculator.Exception.DivisionByZeroException;
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
    public Integer divide(Integer num1, Integer num2) {
        if (num2.equals(0)) {
            throw new DivisionByZeroException("Делить на 0 нельзя!");
        }
        return num1 / num2;
    }
}
