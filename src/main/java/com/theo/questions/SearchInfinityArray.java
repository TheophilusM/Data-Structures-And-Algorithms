package com.theo.questions;

// Find target in a sorted array of infinity size of array
public class SearchInfinityArray {
    public static void main(String[] args) {
        int[] ints = {2, 2, 3, 5, 5, 9, 9, 9, 14, 14, 16, 16, 18};
        int target = 9;
        System.out.println("Result: " +findStartAndEnd(ints, target) );
    }

    static int findStartAndEnd(int[] arr, int target) {
        // start with window if 2
        int start = 0;
        int end = 2;

        // condition of target in range
        while (target >= arr[end]) {
            if (target < end) {
                return binarySearch(arr, target, start, end);
            } else {
                int temp = end + 1;
                end = end + (end - start + 1) * 2;
                start = temp;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;     // int has a fixed size range ! ! !
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }

        // if value not found
        return -1;
    }
}
