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

