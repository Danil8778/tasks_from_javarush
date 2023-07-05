package com.pnevsky.loops;

public class SumOfNonMultipleThree {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i < 101){
            if( i % 3 == 0) {
                i++;
                continue;
            }
            sum = i + sum;
            i++;
        }
        System.out.println(sum);
    }
}
