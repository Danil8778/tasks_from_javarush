package com.pnevsky.arrays;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arrayN = new int[n];
        for (int i = 0; i < n; i++) {
            arrayN[i] = scanner.nextInt();
        }
        if (n % 2 == 0) {
            for (int i = 0; i < arrayN.length; i++) {
                System.out.println(arrayN[arrayN.length - i - 1]);
            }
        }
        else {
            for (int i = 0; i < arrayN.length; i++) {
                System.out.println(arrayN[i]);
            }
        }
    }
}
