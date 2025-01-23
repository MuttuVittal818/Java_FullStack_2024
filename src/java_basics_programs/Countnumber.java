package java_basics_programs;

public class Countnumber {
    public static void main(String[] args) {

        int count = 0, num = 01020050;

        while (num != 0) {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }

}
