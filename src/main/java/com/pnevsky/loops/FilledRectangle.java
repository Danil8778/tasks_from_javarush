package com.pnevsky.loops;

public class FilledRectangle {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 5) {
            while (j < 10) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }
}
