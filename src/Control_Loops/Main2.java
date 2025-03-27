package Control_Loops;

public class Main2 {
    public static void main(String[] args) {

       // for loop
        // int i =1;   instead we use inside for loop
        for (int i = 1;  i <= 10; i++){   // for loop
            // using break statement in loop
            if (i == 5){
                break;
            }
            System.out.println(i + "  Hello World " );
        }
        System.out.println("Loop ended");
    }
}
