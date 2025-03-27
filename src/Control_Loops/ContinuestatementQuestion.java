package Control_Loops;

import java.util.Scanner;

public class ContinuestatementQuestion {
    public static void main(String[] args) {
        // Display all numbers entered by user expect multiple of 10
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num % 10 == 0)
                continue;

            System.out.println("Number entered: " + num);
        }while(true);


    }
}
