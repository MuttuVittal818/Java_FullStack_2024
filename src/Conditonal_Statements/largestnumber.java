package Conditonal_Statements;

public class largestnumber {
    public static void main(String[] args) {
        int a = 1, b = 11, c =  9;

        if (( a >= b) && (a >= c)){
            System.out.println("The largest number is " + a);
        }
        else if(b >= c){
            System.out.println("The largest number is " + b);
        }
        else{
            System.out.println("The largest number is " + c);
        }

    }
}
