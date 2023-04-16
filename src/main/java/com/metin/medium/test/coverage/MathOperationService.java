package com.metin.medium.test.coverage;

public class MathOperationService {

    public float divide(float number1, float number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divide by zero...");
        return number1 / number2;
    }

    public float add(float number1, float number2) {
        return number1 + number2;
    }

    public float subtract(float number1, float number2) {
        return number1 - number2;
    }

    public static float multiply(float number1, float number2) {
        return number1 * number2;
    }
}
