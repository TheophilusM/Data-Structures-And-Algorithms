package com.theo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
    public static void main(String[] args) {
        // dynamic array - dynamic size
        /*
            Array List:
            - generics
                - data type that can be stored
                - only wrapper classes
                - can be ignored -> ArrayList<>
            -
         */
        ArrayList<Integer> integersList = new ArrayList<>(5);
        integersList.add(16);
        integersList.add(31);
        integersList.add(14);
        integersList.add(3);
        integersList.add(14);
        integersList.add(15);
        integersList.add(16);
        integersList.add(31);
        integersList.add(14);

        integersList.set(4, 24);  // (index, newValue)
        integersList.remove(4);  // (index)

        System.out.println(integersList.contains(243));
        System.out.println();
        System.out.println(integersList); // Converted toString by default

        Scanner scanner = new Scanner(System.in);

        // input/update using for loop
        for(int i = 0; i < 10; i++) {
            integersList.set(i, scanner.nextInt());
        }
    }
}
