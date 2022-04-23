package com.theo;

import java.util.Scanner;

// take user input
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int ans = 0;
        while (true) {
            // take user input
            System.out.print("Enter operation type + - * / % x : ");
            char c = scanner.next().trim().charAt(0);
            if (c == '+' ||
                    c == '-' ||
                        c == '*' ||
                            c == '/' ||
                                c == '%' ) {
                // input two number
                System.out.print("Enter 1st number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter 2nd number: ");
                int num2 = scanner.nextInt();
                ans = calculator.calculatorMethod(num1, num2, c);
                if (c == 'x' || c == 'X') {
                    break;
                }
                else {
                    System.out.println("Invalid input");
                }
            System.out.println("Answer: " + ans);
            }
        }

    }
    public int calculatorMethod (int a, int b , char c) {
        if(c == '+') {
            return a + b;
        }
        if(c == '-') {
            return a - b;
        }
        if(c == '*') {
            return a * b;
        }
        if(c == '/') {
            if(b != 0) {
                return a / b;
            }
        }
        if(c == '%') {
            return a % b;
        }
        else return 0;
    }
}

// Conditions
/*
    1. if-else
    2. for loop
    3. while loop
    4. do while loop
 */