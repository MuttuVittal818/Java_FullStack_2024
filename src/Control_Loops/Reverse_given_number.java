package Control_Loops;

public class Reverse_given_number {
    public static void main(String[] args) {

        // Reverse the given number.
        int n =10899;
        int rev = 0;

        while(n>0){
            int lastdigit =n %10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);
    }


}
