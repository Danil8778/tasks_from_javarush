package com.pnevsky.loops;

import java.util.Scanner;

public class Glass {
    public static void main(String[] args) {
        double glass = 0.5;

        Scanner scanner = new Scanner(System.in);
        boolean view = scanner.nextBoolean();
        if(view == false)
            System.out.println((int)Math.floor(glass));
        else if (view == true)
            System.out.println((int)Math.ceil(glass));

    }
}
