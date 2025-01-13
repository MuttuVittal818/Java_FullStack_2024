package java_basics;
import java.util.Scanner;

class Readinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.println("Enter a number:");
        int number = scanner.nextInt(); // Read the input number
        System.out.println("You entered: " + number);
    }
}
