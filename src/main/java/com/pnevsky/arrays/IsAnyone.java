package com.pnevsky.arrays;

import java.util.Arrays;

public class IsAnyone {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {

        int[] sortArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortArray);
        int result = Arrays.binarySearch(sortArray, element);
        System.out.println(result >= 0);
;
    }
}
