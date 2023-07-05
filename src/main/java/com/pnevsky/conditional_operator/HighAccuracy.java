package com.pnevsky.conditional_operator;

import java.util.Scanner;

public class HighAccuracy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if ( Math.abs(a - b) < 0.000001 )
        System.out.println("числа равны");
        else
        System.out.println("числа не равны");
    }
}
