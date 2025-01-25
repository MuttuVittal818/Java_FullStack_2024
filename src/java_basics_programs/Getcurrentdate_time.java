package java_basics_programs;

import java.time.LocalDateTime;

public class Getcurrentdate_time {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
    }
}
