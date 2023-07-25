package com.pnevsky.arrays;

import java.util.Scanner;

public class MinArrayElement {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = ints[0];
//        for (int i = 1; i < ints.length; i++) {
//            if (ints[i] < min) {
//                min = ints[i];
//            }
//        }
        for ( int element : ints) {
            min = Math.min(min, element);
        }

        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] arrayTen = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayTen[i] = scanner.nextInt();
        }
        return arrayTen;
    }
}



