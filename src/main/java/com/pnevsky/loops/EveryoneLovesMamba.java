package com.pnevsky.loops;

import java.util.Scanner;

public class EveryoneLovesMamba {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int count = 0;

        while (count < 10){
            System.out.println(name + text);
            count++;
        }
    }
}

