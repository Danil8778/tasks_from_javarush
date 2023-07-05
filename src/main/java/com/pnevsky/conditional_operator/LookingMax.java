package com.pnevsky.conditional_operator;

import java.util.Scanner;

public class LookingMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        System.out.println(numberA > numberB ? numberA : numberB);

//        if (numberA > numberB) {
//            System.out.println(numberA);
//        } else {
//            System.out.println(numberB);
//        }
    }
}
