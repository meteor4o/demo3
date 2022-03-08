package com.example.demo.codeexercises;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word) {
//        boolean result = true;
        int num1 = 0;
        int num2 = word.length()-1;

        while (num2 > num1) {
            if (word.charAt(num1) != word.charAt(num2)) {
                return false;
            }
            num1++;
            --num2;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(isPalindrome(input));


    }
}
