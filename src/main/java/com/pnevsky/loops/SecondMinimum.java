package com.pnevsky.loops;

import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while(scanner.hasNextInt()){
            int current = scanner.nextInt();
            if (current > min && current < secondMin){
                secondMin = current;
            }
            else if (current < min){
                secondMin = min;
                min = current;
            }
        }
        System.out.println(secondMin);
    }
}
