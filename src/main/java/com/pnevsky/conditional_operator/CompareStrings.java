package com.pnevsky.conditional_operator;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        if ( a.equals(b))
        System.out.println("строки одинаковые");
        else
        System.out.println("строки разные");
    }
}

