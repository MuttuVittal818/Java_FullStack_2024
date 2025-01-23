package java_basics_programs;

import java.util.ArrayList;
import java.util.List;

public class Jointwolists {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("1,2,3,4,5");

        List<String> list2 = new ArrayList<String>();
        list2.add("A, B, C, D, E");

        List<String> joined = new ArrayList<String>();

        joined.addAll(list1);
        joined.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);

    }
}
