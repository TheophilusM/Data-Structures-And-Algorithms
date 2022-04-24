package com.theo.questions;

import java.util.Arrays;

public class FirstAndLastPotion {
    public static void main(String[] args) {
        int[] ints = {2, 2, 3, 5, 5, 9, 9, 9, 14, 14, 16, 16, 18};
        int target = 9;
        System.out.println("Value is: " + Arrays.toString(ceilingMethod(ints, target)));;
    }

    static int[] ceilingMethod(int[] arr, int target) {
        int[] ans = {-1, -1};

        // check for first occurrence of target
        ans[0] = findTargetMethod( arr, target, true);
        if (ans[0] != -1) {
            ans[1] = findTargetMethod( arr, target, false);
        }

        // if value not found
        return ans;
    }

    static int findTargetMethod(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}
