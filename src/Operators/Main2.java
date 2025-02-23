package Operators;

public class Main2 {
    public static void main(String[] args) {

        // Unary operators
        // unary operators are operators that perform operations on a single operand.

        // Pre Increment operators ++a
        // Increments the value first, then uses it.

        int a = 10;
        int b = ++a;    // increment a value
        System.out.println("Pre Increment: a = " + a + ", b = " + b);

        // Post Increment operators a++
        // Uses the value first, then increments it.

        int c = 10;
        int d = c++;    // increment a value
        System.out.println("Post Increment: c = " + c + ", d = " + d);

        // Pre Decrement
        // Decrements the value first, then uses it.

        int e = 10;
        int f = --e;    // decrement a value
        System.out.println("Pre Decrement: e = " + e + ", f = " + f);

        // Post Decrement
        // Uses the value first, then decrements it.

        int g = 10;
        int h = g--;    // decrement a value
        System.out.println("Post Decrement: g = " + g + ", h = " + h);


    }
}
