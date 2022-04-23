package com.theo.questions;

import java.util.Scanner;

// Check if letter input is upper or lower case
public class LetterCaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char c = scanner.next().trim().charAt(0);

        if (c >= 'a' && c <= 'z'){
            System.out.println("Lowercase letter");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Uppercase letter");
        }
    }
}
