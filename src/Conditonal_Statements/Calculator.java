package Conditonal_Statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Choose an operator (+, -, *, /, %) : ");  // Asking for operator from user.
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println("Results: " + (a+b));
                break;

            case '-' : System.out.println("Results: " + (a-b));
             break;

             case '*' : System.out.println("Results: " + (a*b));
             break;

             case '/' : System.out.println("Results: " + (a / b));
             break;

             case '%' : System.out.println("Results: " + (a % b));
             break;

             default: System.out.println("Invalid operator");
        }
    }
}
