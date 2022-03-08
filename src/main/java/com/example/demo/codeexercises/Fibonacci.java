package com.example.demo.codeexercises;

import java.util.Scanner;

public class Fibonacci {
    public static Integer fibonacci(Integer n) {
        if(n == 1) {
            return 1;
        } else if(n == 0) {
            return 0;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = Integer.parseInt(sc.next());
        for (int i = 0; i < num; i++) {
            result = fibonacci(num);
        }
        System.out.println(fibonacci(num));

    }
}

