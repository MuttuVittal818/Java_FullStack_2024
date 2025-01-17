package java_basics;

public class Convertchartostring {
    public static void main(String[] args) {
        char[] ch = {'H', 'o', 'n', 'e', 'y'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
    }
    }
