package com.pnevsky.loops;

public class UnfilledRectangle {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < 2){
            while(j < 20){
                System.out.print("Б");
                j++;
            }
            System.out.println();
            while(k < 8){
                System.out.println("Б                  Б");
                k++;
            }
            j=0;
            i++;
        }
    }
}
