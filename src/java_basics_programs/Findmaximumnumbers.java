package java_basics_programs;
import java.util.*;
import java.util.Scanner;

public class Findmaximumnumbers {
    public static void main(String args[]) {
        int num1 = -2;
        int num2 = -5;
        int num3 = 0;
        if (num1 >= num2 && num1 >= num3)
            System.out.println( num1 + " is the maximum number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println( num2 + " is the maximum number.");
        else
            System.out.println( num3 + " is the maximum number.");
    }
}

