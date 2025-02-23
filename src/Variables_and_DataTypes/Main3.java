package Variables_and_DataTypes;

public class Main3 {

        public void printNumber() {
            int number = 10; // Local variable
            System.out.println("Number: " + number);
        }

        public static void main(String[] args) {
            Main3 obj = new Main3();
            obj.printNumber(); // Output: Number: 10
        }
    }

/*  Local Variable

    A local variable is the one which is declared with the body of a method.
    It’s scope is limited to the body of that method and the other methods in the class aren’t even aware of the existence of such variable.
    Initial declaration of local variable is compulsory.
    Static variables are declared using the static keyword within a class outside any method constructor or block.
*/