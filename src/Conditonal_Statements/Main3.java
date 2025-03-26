package Conditonal_Statements;

public class Main3 {
    public static void main(String[] args) {
        // else if or if else if
        int score = 65;

        if (score >= 80) {
            System.out.println("A");
        }
        else if (score >= 70) {
            System.out.println("B");
        }
        else if (score >= 60) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
