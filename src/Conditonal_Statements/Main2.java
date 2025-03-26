package Conditonal_Statements;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        // Print if a number is even or odd
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if(number % 2 == 0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

    }
}
