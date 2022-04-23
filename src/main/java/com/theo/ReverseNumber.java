package com.theo;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int result = 0;

        while (i > 0) {
            int last = i%10;
            i /= 10;
            result = result * 10 + last;
        }

        System.out.println("Result: " + result);
    }
}
