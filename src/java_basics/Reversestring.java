package java_basics;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseWords(input);

        System.out.println("Reversed words: " + reversed);

        scanner.close();
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
