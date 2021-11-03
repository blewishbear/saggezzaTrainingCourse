package com.spring.saggezza.technicalclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void given1Get1() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 1
        String result = fb.generate(1);
        // Then: I get back "1"
        assertEquals("1", result);
    }

    @Test
    public void given2Get1_2() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 2
        String result = fb.generate(2);
        // Then: I get back "1,2"
        assertEquals("1,2", result);
    }

    @Test
    public void given3Get1_2_Fizz() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 3
        String result = fb.generate(3);
        // Then: I get back "1,2,Fizz"
        assertEquals("1,2,Fizz", result);
    }

    @Test
    public void given3Get1_2_Fizz_4() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 4
        String result = fb.generate(4);
        // Then: I get back "1,2,Fizz,4"
        assertEquals("1,2,Fizz,4", result);
    }

    @Test
    public void given5EndsWithBuzz() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 5
        String result = fb.generate(5);
        // Then: I get back a string ending with "Buzz"
        assertTrue(result.endsWith("Buzz"));
    }

    @Test
    public void given5EndsWithFizz() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 6
        String result = fb.generate(5);
        // Then: I get back a string ending with "Buzz"
        assertTrue(result.endsWith("Fizz"));
    }

    @Test
    public void given10EndsWithBuzz() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 10
        String result = fb.generate(10);
        // Then: I get back a string ending with "Buzz"
        assertTrue(result.endsWith("Buzz"));
    }

    @Test
    public void given15EndsWithBuzz() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 15
        String result = fb.generate(15);
        // Then: I get back a string ending with "Buzz"
        assertTrue(result.endsWith("FizzBuzz"));
    }

    @Test
    public void given30EndsWithFizzBuzz() {
        IFizzBuzz fb = new FizzBuzz();
        // Given: I am a user
        // When: I enter an integer 30
        String result = fb.generate(30);
        // Then: I get back a string ending with "FizzBuzz"
        assertTrue(result.endsWith("FizzBuzz"));
    }
}
