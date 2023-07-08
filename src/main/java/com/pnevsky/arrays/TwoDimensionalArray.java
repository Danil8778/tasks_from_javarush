package com.pnevsky.arrays;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        multiArray = new int[n][];

        for (int i = 0; i < n; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }
    }
}
