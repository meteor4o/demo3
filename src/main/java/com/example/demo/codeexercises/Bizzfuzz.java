package com.example.demo.codeexercises;

public class Bizzfuzz {
    public String fizzBuzz(Integer i) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";

        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
