package com.theo.searching;

public class Binary {
    public static void main(String[] args) {
        int[] ints = {-35, -34, -25, -14, -6, 0 ,1, 4, 6, 7, 25, 46, 68};   // ascending order
        int target = 0;
        System.out.println("Index: " + binarySearch(ints, target));
        System.out.println("Index: " + orderAgnosticBS(ints, target));
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    static int orderAgnosticBS(int[] ints, int target) {
        int start = 0;
        int end = ints.length - 1;

        // find array sorting order
        boolean isAsc = ints[start] < ints[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;     // int has a fixed size range ! ! !
            int mid = start + (end - start) / 2;
            // if end and start are equal
            if (ints[start] == ints[end]) {
                return mid;
            }

            if (isAsc) {
                if (target < ints[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > ints[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        // if value not found
        return -1;
    }
}

/*
    Binary:
    * Ordered
        - ascending
        - descending
    * Steps ->
        - 1. Finds the middle element.
        - 2. Check if target is greater or less than middle element to select side for searching.
        - 3. If middle is the target element, search is complete.
        - 4. Finds new middle element of the remaining side after the current middle element and so on...
        - 5. If start is greater than and then target not found
        - N/2^k
            - k -> level od division from 0
            - Time of complexity -> log2(Comparisons)
    * Why ->
        - Constant time complexity - best case

    Order agnostic:
    * Steps
        - 1. Find if sorted order is ascending or descending
            -> Use first and last number
            -> If first == start... same elements in array
        - 2.
 */