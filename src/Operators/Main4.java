package Operators;

public class Main4 {
    public static void main(String[] args) {

        // Logical Operators
        // Logical operators are used to combine multiple conditions and evaluate them as a single boolean expression.

        // AND Operator (&)
        // The AND operator returns true if both operands are true.
        // In other words, it returns true only if both operands are true.

        boolean result1 = true && true;  // true
        boolean result2 = true && false; // false
        boolean result3 = true && false; // false
        boolean result4 = true && false; // false

        System.out.println("AND Opertor:  " + ((2>1) && (2>1)));

        // OR Operator (|)
        // The OR operator returns true if either of the operands is true.
        // In other words, it returns true if either operand is true.
        boolean result11 = true || true;  // true
        boolean result12 = true || false; // true
        boolean result13 = false || true; // true
        boolean result14 = false || false; // false

        System.out.println("OR Opertor:  " + ((2>1) && (3>2)));



        // NOT Operator (!)
        // The NOT operator returns true if the operand is false and false if the operand is true.
        boolean result5 =!true;  // false
        boolean result6 =!false; // true

        System.out.println("NOT Opertor:  " + !(1>5));
        System.out.println("NOT Opertor:  " + !(1<5));





    }
}
