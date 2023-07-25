package com.pnevsky.arrays;

import java.util.Arrays;

public class DivideArray {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {

        double middle = Math.ceil(array.length / 2.0);
        result[0] = Arrays.copyOfRange(array, 0, (int)middle);
        result[1] = Arrays.copyOfRange(array, (int)middle, array.length);
        System.out.println(Arrays.deepToString(result));

    }
}
