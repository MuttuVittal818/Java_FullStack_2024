package Variables_and_DataTypes;

import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, RollNo, Marks, Grade");

        String name = sc.nextLine();		//used to read line
        int RollNo = sc.nextInt();			//used to read int
        double Marks = sc.nextDouble();		//used to read double
        char Grade = sc.next().charAt(0);	//used to read till space


        System.out.println("Name: "+name);
        System.out.println("Gender: "+RollNo);
        System.out.println("Marks: "+Marks);
        System.out.println("Grade: "+Grade);

        sc.close();


    }
    }


// User Input/Output
/* Output
    Output refers to displaying data to the user, typically on the console or screen. */

/* Input
    Input refers to accepting data from the user, typically through the keyboard.  */
