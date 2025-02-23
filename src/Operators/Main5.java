package Operators;

public class Main5 {
    public static void main(String[] args) {

        // Assignment operator
        // The assignment operator (=) is used to assign a value to a variable.

        int a = 10;
        a = a + 10;
        System.out.println("Value of a after assignment: " + a);

        int b = 10;
        b += 10;       //  insated of a = a + b;
        System.out.println("Value of b after assignment: " + b);

        int c = 10;
        c -= 5;       //  insated of c = c - 5;
        System.out.println("Value of c after assignment: " + c);

        int d = 10;
        d *= 2;       //  insated of d = d * 2;
        System.out.println("Value of d after assignment: " + d);

        int e = 10;
        e /= 5;       //  insated of e = e / 5;
        System.out.println("Value of e after assignment: " + e);

        int f = 10;
        f %= 3;       //  insated of f = f % 3;
        System.out.println("Value of f after assignment: " + f);

        int g = 10;
        g <<= 2;       //  insated of g = g * (2^2);
        System.out.println("Value of g after assignment: " + g);

        int h = 10;
        h >>= 1;       //  insated of h = h / (2^1);
        System.out.println("Value of h after assignment: " + h);

        int i = 10;
        i >>>= 1;       //  insated of i = i >> (32 - 1);
        System.out.println("Value of i after assignment: " + i);

        // Compound assignment operators
        // Compound assignment operators are used to perform arithmetic operations and assignment in a single line.

        int j = 10;
        j += 5;       //  insated of j = j + 5;
        System.out.println("Value of j after compound assignment: " + j);

        int k = 10;
        k -= 2;       //  insated of k = k - 2;
        System.out.println("Value of k after compound assignment: " + k);

        int l = 10;
        l *= 3;       //  insated of l = l * 3;
        System.out.println("Value of l after compound assignment: " + l);

        int m = 10;
        m /= 4;       //  insated of m = m / 4;
        System.out.println("Value of m after compound assignment: " + m);



    }
}
