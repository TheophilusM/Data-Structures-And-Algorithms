package com.theo;

import java.util.Scanner;

// Question to find the largest number of values input
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print 1st number ");
        int a = scanner.nextInt();
        System.out.print("Print 2nd number ");
        int b = scanner.nextInt();
        System.out.print("Print 3rd number ");
        int c = scanner.nextInt();
        System.out.println();

        int largest = 0;
        if (largest < a) {
            largest = a;
        }

        if (largest < b) {
            largest = b;
        }

        if (largest < c) {
            largest = c;
        }
        System.out.println("Method 1, largest number is " + largest);

        int largestNumber = (Math.max(
                c,
                Math.max(
                        a,b
                )));

        System.out.println("Method 2, largest number is " + largestNumber);
    }
}
