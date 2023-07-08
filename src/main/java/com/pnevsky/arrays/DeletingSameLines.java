package com.pnevsky.arrays;

import java.util.Scanner;

public class DeletingSameLines {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 6; j++) {
                if( strings[i] != null && strings[i].equals(strings[j])) {
                    strings[j] = null;
                    count++;
                }
            }
            if (count > 0)
                strings[i] = null;
            count = 0;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
