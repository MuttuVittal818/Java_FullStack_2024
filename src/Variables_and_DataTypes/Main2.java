package Variables_and_DataTypes;

public class Main2 {
    public static void main(String[] args) {

// Java supports different data types such as int, double, float, char, boolean, long, short, byte, and String.


// Primitive types and Non-Primitive Types

        // Primitive types

        int age = 25;
        System.out.println("Size of int: " + Integer.BYTES + " bytes" + "value" + age);

        char grade = 'A';
        System.out.println("Size of char: " + Character.BYTES + " bytes" + "value" + grade);

        boolean isTrue = true;
        System.out.println("Size of value" +isTrue);

        double pi = 3.14159;
        System.out.println(pi);

        float decimalNumber = 3.14f;
        System.out.println(decimalNumber);

        long bigNumber = 1000000000000L;
        System.out.println(bigNumber);

        short smallNumber = 32767;
        System.out.println(smallNumber);

        byte byteNumber = 127;
        System.out.println(byteNumber);

        char specialCharacter = '\u00A9';
        System.out.println(specialCharacter);

        // Invalid data types
        // int x = 10.5; // float can't be assigned to an int
        // double y = 10; // int can't be assigned to a double
        // float z = 10 + 20L; // long can't be added to a float


        // Non-Primitive types

        String name = "John Doe";
        System.out.println(name);

        String[] names = {"John", "Doe"};
        System.out.println(names);



        // Invalid data types
        // int[] numbers = {1, 2, 3}; // int array can't be assigned to a String
        // String[] names = {"John", "Doe"}; // String array can't be assigned to an int array

    }
}
