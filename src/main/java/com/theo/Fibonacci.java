package com.theo;

import java.util.Scanner;

// Find the nth Fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
        /*
            a = 0
            b = 1
            n = ?
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prevNumber = 0;
        int currentNumber = 1;

        int count = 2;

        while (count <= n) {
            int notChangedYet = currentNumber;
            // add prev 2 number
            currentNumber += prevNumber;
            prevNumber = notChangedYet;

            count++;
        }
        System.out.println("");
    }
}

/*
    0, 1, 1, 2, 3, 5, 8 ...
        - adds two preceding number
 */