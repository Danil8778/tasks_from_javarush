package com.pnevsky.loops;

import java.util.Scanner;

public class WindSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatureMS = scanner.nextInt();
        long temperatureKmY = Math.round(temperatureMS * 3.6);
        System.out.println(temperatureKmY);

    }
}
