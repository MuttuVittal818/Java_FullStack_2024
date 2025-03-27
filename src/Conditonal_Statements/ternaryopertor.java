package Conditonal_Statements;

public class ternaryopertor {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 7;

        // ternary opertor

        String result = (num1 % 2 == 0)? "even" : "odd";
        System.out.println(result);

        int type = (num1 > num2) ? 4 : 7;
        System.out.println(type);

        // Check if a student will pass or fail

        int marks = 34;
        String status = (marks >= 35)? "Pass" : "Fail";
        System.out.println(status);
    }
}
