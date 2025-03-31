package Function_Methods;

public class product2numbers {
    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        int product = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        product = multiply(20, 10);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}

