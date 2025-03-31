package Function_Methods;

public class swap {
    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    public static void main(String[] args) {
        int a = 5, b = 10;               // call by Value methods
        swapNumbers(a, b);
        //System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
