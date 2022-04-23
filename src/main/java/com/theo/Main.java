package com.theo;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);    // Passed as >> java Main 23 "Theo"
        System.out.println("Data Structures and Algorithm");
    }
}

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

/*
    Compilation:
        >> javac Main.java
        >> javac -d .. Main.java    // specifying location to save
        >> java Main
 */