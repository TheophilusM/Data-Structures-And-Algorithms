package com.theo.questions;

import java.util.Scanner;

// How many times a number occurs in an integer
public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = 53256423;
        int n = scanner.nextInt();
        int count = 0;

        while (value > 0) {
            int check = value%10;
            if (check == n) {
                count++;
            }
            value /= 10;
        }

        System.out.println(n + " occurs " + count + " times");
    }
}
