package com.theo;

import java.util.Arrays;

public class SwapArrayValues {
    public static void main(String[] args) {
        int[] ints = {1, 32, 4, 43, 5};
        int[] ints1 = new int[ints.length];
        int length = ints.length;
        int i = 0;
        while (length > 0) {
            ints1[i] = ints[length-1];
            length--;
            i++;
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
    }
}
