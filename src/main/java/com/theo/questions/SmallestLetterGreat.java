package com.theo.questions;

// Smallest letter greater than target
public class SmallestLetterGreat {
    public static void main(String[] args) {
        char[] chars = {'a','c', 'f', 'g','k', 'l', 'o', 'q', 'r', 'z'};
        char target = 'z';
        System.out.println("Letter is: " + smallestChar(chars, target));;
    }

    static char smallestChar(char[] chars, char c) {
        int start = 0;
        int end = chars.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (chars[end] == c) {
                return chars[0];
            }
            if (chars[mid] == c) {
                return chars[mid + 1];
            }
            if (chars[start] == c) {
                return chars[start+1];
            }
            if (c > chars[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // break out of loop
        return chars[start % chars.length];
    }
}
