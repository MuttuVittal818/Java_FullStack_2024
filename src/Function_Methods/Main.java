package Function_Methods;

import java.util.*;

public class Main {

    public static int Calculate(int a, int b){
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = Calculate(a, b);
        System.out.println("The sum of "  + sum);
    }
}
