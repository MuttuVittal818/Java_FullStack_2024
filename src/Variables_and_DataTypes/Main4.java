package Variables_and_DataTypes;

public class Main4 {
    int number; // Instance variable

    public void printNumber() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        Main4 obj = new Main4();
        obj.number = 20; // Assigning value to instance variable
        obj.printNumber(); // Output: Number: 20
    }
}

/*  Instance Variable
    Instance variables are those which are declared inside the body of a class but not within any methods.
    These differ with each instance of the class created although they have the same identity.
    It is called instance variable because its value is instance specific and is not shared among instances.
    It’s default value is zero.
    Syntax: <data_type> <variable_name>;
 */