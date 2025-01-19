package java_basics_programs;
import java.util.Scanner;

class Readinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter a string:");
        String input = scanner.nextLine(); // Read the input string

        System.out.println("You entered: " + input);
    }
}