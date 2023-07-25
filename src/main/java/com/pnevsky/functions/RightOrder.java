package com.pnevsky.functions;

import java.util.Arrays;

public class RightOrder {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            array[j] = copyArray[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
