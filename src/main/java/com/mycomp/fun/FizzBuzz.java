package com.mycomp.fun;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {
    public String runningCount(int limit) {
        return Stream.iterate(1, i -> i + 1)
                .limit(limit)
                .map(this::fizzBuzzOf)
                .collect(Collectors.joining("\n"));
    }

    public String count(int input) {
        return fizzBuzzOf(input);
    }

    private String fizzBuzzOf(int v) {
        if (isForFizz(v) && isForBuzz(v))
            return "FizzBuzz";
        else if (isForFizz(v))
            return "Fizz";
        else if (isForBuzz(v))
            return "Buzz";
        else
            return String.valueOf(v);
    }

    private boolean isForBuzz(int input) {
        return input % 5 == 0;
    }

    private boolean isForFizz(int input) {
        return input % 3 == 0;
    }
}
