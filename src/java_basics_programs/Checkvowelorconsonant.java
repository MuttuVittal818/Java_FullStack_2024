package java_basics_programs;

public class Checkvowelorconsonant {
    public static void main(String[] args) {
        char ch = 'i';

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
