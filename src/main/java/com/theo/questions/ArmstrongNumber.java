package com.theo.questions;

import java.util.Scanner;

// Print armstrong numbers
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = scanner.nextInt();
        int ans = 0;

        while (i > 0) {
            int temp = i%10;
            int cubeVal = temp*temp*temp;
            ans += cubeVal;

            i /= 10;
        }
        System.out.println("Armstrong equivalent is :" + ans);
    }
}

// takes all digits of a number and cube the then added them together
/*
    - a = 134
        -> 1**3 + 3**3 + 4**3
 */
