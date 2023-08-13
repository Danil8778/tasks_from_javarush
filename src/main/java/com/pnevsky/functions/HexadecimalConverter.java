package com.pnevsky.functions;

public class HexadecimalConverter {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0)
            return "";

        String hexString = "";
        while(decimalNumber != 0) {
            hexString = HEX.charAt(decimalNumber % 16) + hexString;
            decimalNumber = decimalNumber / 16;
        }

        return hexString;
    }

    public static int toDecimal(String hexNumber) {
        if(hexNumber == null || hexNumber == "")
            return 0;

        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}
