package com.theo.questions;

// find the highest mid point
public class MountainBitonicArray {
    public static void main(String[] args) {
        int[] mountain = {0, 1 ,2 ,3 ,4 ,5 ,6, 8, 9, 5, 3, 2, 1};
        System.out.println(binarySearch(mountain));
    }
    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // find the middle element
            // int mid = (start + end) / 2;     // int has a fixed size range ! ! !
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid-1]) {
                // in decreasing part of array
                start = mid + 1;
            }
            else {
                // in increasing part of array
                end = mid;
            }
        }
        // if value not found
        return start;
    }
}
