package java_basics_programs;

import java.util.Arrays;

public class Concatenatetwoarrays {
    public static void main(String[] args) {
        int[] array1 = {5, -2, 1};
        int[] array2 = {-8, 3, 6};

        int[] result = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);

        System.arraycopy(array2, 0, result, array1.length, array2.length);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
