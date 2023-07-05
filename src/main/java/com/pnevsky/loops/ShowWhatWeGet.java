package com.pnevsky.loops;

import java.util.Scanner;

public class ShowWhatWeGet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String string = scanner.next();
            if (string.equals("enough"))
                break;
            System.out.println(string);

        }
    }
}
