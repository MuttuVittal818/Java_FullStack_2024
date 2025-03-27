package Control_Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the range value:");  // Ask the user to enter a range value

        Scanner sc =new Scanner(System.in);
        int range = sc.nextInt();
        int count = 1;

        while( count <= range){    // Print the number from 1 to n value
            System.out.println(count);
            count++;
        }

    }
}
