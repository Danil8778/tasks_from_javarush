package com.pnevsky.loops;

public class WontWork {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int count = 0;
        while (count < 100) {
            System.out.println(quote);
            count++;
        }

    }
}
