package java_basics_programs;

class Test {
    // override the toString() method inside the class.
    @Override
    public String toString() {
        return "object";
    }

}

class Main {
    public static void main(String[] args) {

        // create an object of the Test class
        Test obj = new Test();

        // print the object
        System.out.println(obj);
    }
}



