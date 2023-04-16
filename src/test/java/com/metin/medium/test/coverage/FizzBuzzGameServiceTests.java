package com.metin.medium.test.coverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzGameServiceTests {

    FizzBuzzGameService fizzBuzzGameService = new FizzBuzzGameService();

    @Test
    void theNumberCanBeDividedByFive() {
        String result = fizzBuzzGameService.findCorrectWord(50);
        assertEquals("Buzz", result);
    }

    @Test
    void theNumberCannotBeDividedByFiveAndThree() {
        String result = fizzBuzzGameService.findCorrectWord(77);
        assertEquals("77", result);
    }
}
