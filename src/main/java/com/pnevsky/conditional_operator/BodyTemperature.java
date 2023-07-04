package com.pnevsky.conditional_operator;

import java.util.Scanner;

public class BodyTemperature {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишите тут ваш код
        if (bodyTemperature > 37) {
            System.out.println("температура тела высокая");
        } else if (bodyTemperature < 36){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}

