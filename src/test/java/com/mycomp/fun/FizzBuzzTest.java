package com.mycomp.fun;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldGetFunCount() throws Exception {
        String funCount = fizzBuzz.runningCount(15);
        assertEquals(
                "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz", funCount);
    }

    @Test
    public void shouldReturnNumberAsPerCount() throws Exception {
        assertFizzBuzzs("1", 1);
    }

    @Test
    public void shouldReturnFizzForMultipleOf3() throws Exception {
        assertFizzBuzzs("Fizz", 3);
    }

    @Test
    public void shouldReturnBuzzForMultipleOf5() throws Exception {
        assertFizzBuzzs("Buzz", 5);
    }

    @Test
    public void shouldReturnFizzBuzzForMultipleOf3And5() throws Exception {
        assertFizzBuzzs("FizzBuzz", 15);
    }

    private void assertFizzBuzzs(String s, int i) {
        assertEquals(s, getFBCount(i));
    }

    private String getFBCount(int input) {
        return fizzBuzz.count(input);
    }
}
