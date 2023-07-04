package com.pnevsky.conditional_operator;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();

        if (temperature < 0) {
            System.out.println(cold);
        }
        else {
            System.out.println(warm);
        }

    }
}





