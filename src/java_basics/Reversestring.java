package java_basics;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the words
        String reversed = reverseWords(input);

        // Output the result
        System.out.println("Reversed words: " + reversed);

        scanner.close();
    }

    // Function to reverse the words in a string
    public static String reverseWords(String s) {
        // Split the string into words using space as a delimiter
        String[] words = s.split(" ");

        // Use StringBuilder to reverse the words
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space between words
            }
        }

        return reversed.toString();
    }
}
