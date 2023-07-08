package com.pnevsky.arrays;

import java.util.Scanner;

public class Max {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i])
                max = array[i];
        }
        System.out.println(max);
    }
}
