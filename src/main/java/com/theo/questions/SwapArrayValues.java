package com.theo.questions;

import java.util.Arrays;

public class SwapArrayValues {
    public static void main(String[] args) {
        int[] ints = {1, 32, 24, 43, 5, 4, 54 ,6};
        swap(ints, 2, 4);
    }

    static void swap(int[] ints, int index1, int index2) {
        int temp  = ints[index1];
        ints[index1] = ints[index2];
        ints[index2] = temp;
        System.out.println(Arrays.toString(ints));
    }
}
