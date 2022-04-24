package com.theo.questions;

// Finding smallest element in array ( >= ) target element -> ceiling
public class CeilingNumber {
    public static void main(String[] args) {
        int[] ints = {2, 3, 5, 9, 14, 16, 18};
        int target = 6;
        System.out.println("Value is: " + ceilingMethod(ints, target));;
    }

    static int ceilingMethod(int[] ints, int target) {
        int start = 0;
        int end = ints.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > ints[ints.length - 1] ||
                    target < ints[0]) {
                return -1;
            }
            if (ints[mid] == target) {
                return ints[mid];
            }
            if (ints[start] == target) {
                return ints[start];
            }
            if (ints[end] == target) {
                return ints[end];
            }
            if (target > ints[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // break out of loop
        return ints[start];
    }
}
