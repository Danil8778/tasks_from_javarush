package com.pnevsky.loops;

import java.util.Scanner;

public class AreaOfTheCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println((int)(3.14 * radius * radius));

    }
}
