package com.pnevsky.loops;

import java.util.Scanner;

public class ShareCoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = scanner.nextInt();
        int humans = scanner.nextInt();
        double result = 1.0 * bottles / humans;
        System.out.println(result);
    }
}
