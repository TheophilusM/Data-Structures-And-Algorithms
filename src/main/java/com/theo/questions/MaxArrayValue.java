package com.theo.questions;

import java.util.Arrays;

public class MaxArrayValue {
    public static void main(String[] args) {
        int[] ints = {1, 32, 24, 43, 5, 4, 54 ,6, 4};
        swap(ints);
    }

    static void swap(int[] ints) {
        int largest = 0;
        for (int i: ints
             ) {
            if(i > largest) {
                largest = i;
            }
        }
        System.out.println("Largest value: " + largest);
    }
}
