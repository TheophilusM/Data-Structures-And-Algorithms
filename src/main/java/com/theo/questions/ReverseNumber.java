package com.theo.questions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = 0;

        while (i > 0) {
            // get last value
            int last = i%10;
            // remove last value from input
            i /= 10;
            // multiply current result by 10 and add last number
            result = result * 10 + last;
        }

        System.out.println("Result: " + result);
    }
}
