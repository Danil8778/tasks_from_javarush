package com.pnevsky.loops;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if (current > max && current % 2 == 0)
                max = current;
        }
        System.out.println(max);
    }
}
