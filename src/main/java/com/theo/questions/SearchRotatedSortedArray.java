package com.theo.questions;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] ints = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Index: " + binarySearch(ints, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find array pivot
        while (arr[start] > arr[end]) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // found mid point
                start = mid;
            }
            if (arr[mid] < arr[mid-1]) {
                // found mid point
                start = mid;
            }
            else {
                start = mid + 1;
            }
        }

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
