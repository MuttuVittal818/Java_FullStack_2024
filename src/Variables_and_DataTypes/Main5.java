package Variables_and_DataTypes;

public class Main5 {
    static String name;
    static int marks;

    public static void main(String[] args) {
        name = "Ben";
        marks = 95;
        System.out.println(name + " Scored " + marks + "%.");
    }
}

/*  Static Variable
    A variable declared with the static keyword inside a class but outside any method, constructor, or block.
    We can create a single static variable which can be shared among all the instances of the class.
    Static variables are declared using the static keyword within a class outside any method constructor or block.

 */
