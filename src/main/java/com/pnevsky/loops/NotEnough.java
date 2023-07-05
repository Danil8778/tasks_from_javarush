package com.pnevsky.loops;

import java.util.Scanner;

public class NotEnough {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int number = scanner.nextInt();
        do {
            System.out.println(string);
            number--;
        } while (number > 0 && number < 4);
    }
}
