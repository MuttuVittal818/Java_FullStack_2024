package java_basics_programs;

public class Addtheelements {
    public static void main(String args[]) {

        int arr[] = {12, 13, 1, 10, 34, 10};
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
