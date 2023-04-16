package com.metin.medium.test.coverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathOperationServiceTests {

    MathOperationService mathOperationService = new MathOperationService();

    @Test
    void divideByNotZero() {
        double result = mathOperationService.divide(9, 3);
        assertEquals(3, result);
    }

    @Test
    void case4() {
        double result = MathOperationService.multiply(9, 3);
        assertEquals(27, result);
    }
}
