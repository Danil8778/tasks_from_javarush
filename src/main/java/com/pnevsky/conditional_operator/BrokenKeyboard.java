package com.pnevsky.conditional_operator;

import java.util.Scanner;

public class BrokenKeyboard {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if(secret.equalsIgnoreCase(password))
        System.out.println("доступ разрешен");
        else
        System.out.println("доступ запрещен");
    }
}
