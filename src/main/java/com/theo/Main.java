package com.theo;

import java.util.Scanner;

public class Main {
    // Shadowing - instance variables by re-declaring it in a block scope
    static int i = 20_000;
    public static void main(String[] args) {
        /*
        System.out.println(args[0]);    // Passed as >> java Main 23 "Theo"
         */
        System.out.println("Data Structures and Algorithm");
        System.out.print("Please enter your name: ");
        Scanner scannerInput = new Scanner(System.in); // Taking input from the keyboard
        System.out.println("User input: " + scannerInput.nextLine());
        System.out.println();
        // Primitives - data that can't be broken further
        i = 20_000_000; // shadowing
        /*
            i -> identifier
            20 000 000 -> value
         */
        char c = 'a';
        float v = 98.7f;
        double v1 = 9343343.343; // large decimal
        long l = 34324343423432432L; // large integer
        boolean b = false;
        short i1 = 1024;
        // Wrapper classes
        String s = "Theo";
        Integer integer = 45;
        // Type conversion
        float v2 = scannerInput.nextFloat();  // if user puts an int it will be converted automatically to float
        int i2 = (int) 56.45f;
        byte b1 = (byte) 257;
        /*
            Auto type conversion:
                - float >> integer
                - int >> byte
            Type casting/ narrowing conversion:
                - float << integer
                - int << byte
            Automatic type promotion in expressions
                - auto conversion during computation
                - Rules:
                    - byte and short -> int
                    - ...
         */
        // Unicode principles - can print any character of different languages

        // Switch statements
        String name = scannerInput.nextLine();
        switch (name) {
            case "Theo":
                System.out.println("Name is Theo");
                break;
            case "Taku":
                System.out.println("Name is Taku");
                break;
            default:
                System.out.println("Name not known!");
                break;
        }
        // enhanced switch statement
        if (name.equals("Theo")) {
            System.out.println("Name is Theo");
        }
        // nested switch case
        String fruit = scannerInput.nextLine();
        switch (fruit) {
            case "Round":
                String fruitName = scannerInput.nextLine();
                switch (fruitName) {
                    case "Mango":
                        System.out.println("Name is Mango");
                        break;
                    case "Apple":
                        System.out.println("Name is Apple");
                        break;
                    default:
                        System.out.println("Fruit name unknown!");
                        break;
                }
                break;
            case "Oval":
                System.out.println("Oval fruits...");
                break;
            default:
                System.out.println("Fruit type unknown!");
                break;
        }
    }
}

/*
    Compilation:
        >> javac Main.java
        >> javac -d .. Main.java    // specifying location to save
        >> java Main
 */
// public - accessible from anywhere
// Main - file and class name
// main method
// static - make object be executed without creating an object of the class
// void - return type of the method
// String[] args - array of arguments, args - array name
// System.out.println()
/*
    System:
        - class for printing data
    out:
        - class of PrintStream
        - default command line
    println:
        - outputs a string
        - adds ne line after printing the string
*/
// Scanner - class to input data
/*
    Input:
        - in -> keyboard input
        - FileStreamInput -> file input
    Printing:
        - next() -> 1st string before space only
        - nextLine() -> string
        - nextInt() -> int
        - nextFloat() -> float
        - nextLong() -> long
 */
// function overloading
/*
    - Two methods of the same name with different number and/or type of inputs
 */
