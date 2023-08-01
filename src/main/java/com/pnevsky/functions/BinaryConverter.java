package com.pnevsky.functions;

public class BinaryConverter {
    public static void main(String[] args) {
        int decimalNumber = 100;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1100100";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if(decimalNumber <= 0)
            return "";
        int i = 0;
        String string = "";

        while(decimalNumber != 0) {
            string = (decimalNumber % 2) + string;
            decimalNumber = decimalNumber / 2;
        }
        return string;
    }

    public static int toDecimal(String binaryNumber) {
        if(binaryNumber == null || binaryNumber == "")
            return 0;
        String[] arrayBinaryNumber = binaryNumber.split("");
        int decimalNumber = 0;
        for (int i = 0; i < arrayBinaryNumber.length; i++) {
            if (arrayBinaryNumber[i].equals("1")) {
                decimalNumber = (int)(decimalNumber + Math.pow(2,arrayBinaryNumber.length-(i+1)));
            }
        }
        return decimalNumber;
    }
}

