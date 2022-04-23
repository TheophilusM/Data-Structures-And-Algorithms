package com.theo;

public class Arrays {
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 4;
        int[] ints1 = {1, 2, 4}; // size is 3 (from 0 index to 2)
        System.out.println(Arrays.toString(ints));
    }

    private static boolean toString(int[] ints) {
    }
}

/*
    Arrays:
    - collection of data types
    - dataType[] varName = new dataType[size]
    - dataType[] varName = {val1, val2, val3, val4, val5}
    - same data type
    - declared ref variable created in stack memory
    - initialized object stored in heap memory
 */