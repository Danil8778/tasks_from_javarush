package com.pnevsky.loops;

public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
           if(i % 2 == 0)
            System.out.println(i);
        }
    }
}
