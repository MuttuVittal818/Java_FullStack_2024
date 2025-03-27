package Control_Loops;

public class reversenumber {
    public static void main(String[] args) {
  // Print reverse of a number.

        int n = 322399912;

        while (n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
}
