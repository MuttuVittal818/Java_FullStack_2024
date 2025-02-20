package Inheritance;

public class OOPS1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Raju");
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int roll;

    Student (){
         // Default constructor
    }

    Student(String name){
        this.name = name;               // Parameterized constructor
    }
}
