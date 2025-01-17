package java_basics;

import java.util.Scanner;

public class Powerofanumber {
    public static void main(String[] args) {

        int base = 9, exponent = 7;

        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}
