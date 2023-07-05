package com.pnevsky.loops;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = "";
        int sum = 0;

        while (true){
            number = scanner.next();
            if (number.equals("ENTER") != true)
                sum = Integer.parseInt(number) + sum;
            else {
                System.out.println(sum);
                return;
            }
        }
    }
}
