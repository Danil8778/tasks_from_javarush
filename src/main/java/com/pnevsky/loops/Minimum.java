package com.pnevsky.loops;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(scanner.hasNextInt()){
            int current = scanner.nextInt();
            if(current < min)
                min = current;
        }
        System.out.println(min);
    }
}
