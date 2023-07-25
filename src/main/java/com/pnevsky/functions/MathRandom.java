package com.pnevsky.functions;

public class MathRandom {
    public static void main(String[] args) {
        System.out.println(MathR());
    }

    public static int MathR(){
        int r = (int)(Math.random()*Math.random()*100);
        return r;
    }
}
