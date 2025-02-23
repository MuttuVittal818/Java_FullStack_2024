package Variables_and_DataTypes;

public class Main7 {
    public static void main(String[] args){

        // Implicit conversion
        int a = 10;
        long b = a;

        System.out.println("Implicit conversion  " +a);

        // Explicit conversion
        float c = 10.5f;
        int d = (int) c;

        System.out.println("flaoting value  " + c);
        System.out.println("Explicit conversion  " +d);

        // Type Casting
        char ch = 'A';
        int num = (int) ch;
        System.out.println(num);

        float a1 =23.3f;
        int b1 = (int) a1;
        System.out.println(b1); // Outputs: 23

        // Type Promotion

        int A = 10;
        float B = 1.0f;
        long C = 34;
        double D = 89;
        double total = A + B + C + D;
        System.out.println("Total Type pramotion exprssions: " + total);
    }
}

// Type Conversions functions