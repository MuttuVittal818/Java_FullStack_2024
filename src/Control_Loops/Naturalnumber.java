package Control_Loops;

import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args) {
        // print sum of firtst n natural numbers

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

    }
}
