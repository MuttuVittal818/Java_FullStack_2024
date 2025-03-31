package Function_Methods;

public class factorial {
    public static long factorial(int n) {
        int f =1;
        for(int i =1; i<=n; i++){
            f= f*i;
        }
        return f;  // return factorial  of n number
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
