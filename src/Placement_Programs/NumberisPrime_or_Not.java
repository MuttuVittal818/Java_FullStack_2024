package Placement_Programs;

import java.util.Scanner;

public class NumberisPrime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");  // Prompt the user to enter a number.
        int n = sc.nextInt();

        if(n==2){
            System.out.println("Number is Prime");
        }else{
            boolean isPrime = true;
            // for( int i=2; i<=n-1; i++){
               for(int i =2; i<=Math.sqrt(n); i++){    // optimize the code for finding the largest prime number
                if(n%i == 0){      // n is a multiple of i (i is not equal to 1 or n) it is not prime num
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("Number is Prime");
            }else{
                System.out.println("Number is Not Prime");
            }
        }
    }
}
