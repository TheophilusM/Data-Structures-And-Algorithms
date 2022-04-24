package com.theo.searching;

import java.util.Arrays;

public class Linear {
    public static void main(String[] args) {
        int[] ints = {1, 23 , 43, 3, 5, 24, 6 , 43, 23, 32};
        /*
            String:
                - Searching a character, covert to char array.
         */
        int target = 5;
        System.out.println(linearSearch(ints, target));

        int[][] ints3 = {
                {1, 2, 3},
                {4, 5, 4, 6},
                {7, 8, 9},
        };
        System.out.println(linearSearch(ints3, target));
        System.out.println(numberOfDigits(131453));
    }

    static int linearSearch(int[] ints, int searchNumber) {
        if (ints.length == 0) return -1;

        // run loop to check
        int index = 0;
        for (int i: ints) {
            if (i == searchNumber) {
                return index;   // index, ints[index], searchNumber
            }
            index++;
        }
        return -1;
    }

    static int linearSearch(int[][] ints, int searchNumber) {

        // run loop to check
        for (int i = 0; i < ints.length; i++) {
            int index = 0;
            for (int x: ints[i]) {
                if (x == searchNumber) {
                    System.out.println("[" + i + ", " + index + "]");
                    return index;   // index, ints[index], searchNumber
                }
                index++;
            }
        }
        return -1;
    }

    static int numberOfDigits(int number) {
        if (number < 0) {
            number *= -1;
        }
        return (int) (Math.log10(number)) + 1;
    }
}
