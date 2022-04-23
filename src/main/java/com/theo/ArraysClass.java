package com.theo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        int[] ints = new int[3]; // null object value is used by default
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 4; // => {1, 2, 4};

        int[] ints1 = {1, 2, 4}; // size is 3 (index 0 -> 2)

        arrayMethod(ints);

        System.out.println(Arrays.toString(ints));      // => [...]
        System.out.println(Arrays.toString(ints1));     // => [...]
        System.out.println(ints[0]);                    // => 1

        String[] strings = {"Theo", "Taku", "Mug"};
        System.out.println(Arrays.toString(strings));   // => [...]

        Scanner scanner = new Scanner(System.in);

        // input using for loop
        System.out.print("3 Inputs: ");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        // output using for loop
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Position " + (i+1) + " :" + ints[i]);
        }
        System.out.println();

        // output using while loop
        int check = 0;
        while (check < ints.length) {
            System.out.println("Position " + (check+1) + " :" + ints[check]);
            check++;
        }
        System.out.println();

        // output using enhanced for loop
        int position = 1;
        for (int i : ints) {
            System.out.println("Position " + (position) + " :" + i);
            position++;
        }
    }

    static void arrayMethod(int[] inputs) {
        System.out.println("Method: " + Arrays.toString(inputs));
    }

}

/*
    Arrays:
    - collection of data types
    - fixed size
    - dataType[] varName = new dataType[size]
    - dataType[] varName = {val1, val2, val3, val4, val5}
    - new - used too create an object
    - same data type
    - declared ref variable created in stack memory - at runtime
    - initialized object stored in heap memory - at compile time
        - may not continuous, depends on JVM
        - dynamic memory allocation
        - when index object not defined results in null

    2D Arrays
    - Multidimensional arrays
        -   1 2 3
            4 5 6
            7 8 9
        - int[][] = new[rows][columns]
        - int[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
            };
 */