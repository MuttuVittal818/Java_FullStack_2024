package Variables_and_DataTypes;

class Main1 {
    public static void main(String[] args) {

    // A variable is a container which holds the value while the Java program is executed.

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        String name = "raju";
        System.out.println(name);


        char grade = 'A';
        System.out.println(grade);

        boolean isTrue = true;
        System.out.println(isTrue);

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

        // Invalid variable names
        // int 123abc = 10; // cannot start with a number
        // int @hello = 10; // cannot contain special characters
        // int hello$world = 10; // cannot contain dollar sign
        // int hello_world = 10; // cannot contain underscore
        // int helloWorld = 10; // can contain uppercase letters

        // int HelloWorld = 10; // can start with uppercase letters
        // int hello_world = 10; // can contain underscore
        // int HelloWorld = 10; // can contain uppercase letters
        // int Hello_world = 10; // can contain underscore

        // int HelloWorld = 10; // can't have duplicate variables with same name
        //  int Hello_world
        // int HelloWorld = 10; // can't have duplicate variables with same name
        // int Hello_world = 10; // can't have duplicate variables with same name

    }
}

