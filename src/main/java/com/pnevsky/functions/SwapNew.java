package com.pnevsky.functions;

public class SwapNew {
        private int x;
        private int y;

        public SwapNew(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("x=%d, y=%d", x, y);
        }

        public void swap() {
            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(y));
            System.out.println();
            x ^= y;
            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(y));
            System.out.println();
            y ^= x;
            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(y));
            System.out.println();
            x ^= y;
            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(y));
            System.out.println();
        }

    public static void main(String[] args) {
            int a = 2;
            int b = 7;
            SwapNew swap = new SwapNew(a, b);
        System.out.println(swap);
            swap.swap();
        System.out.println(swap);


    }
}
