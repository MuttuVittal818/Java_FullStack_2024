package java_basics_programs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Display Current date and time

public class Getcurrentdate_time {
    public static void main(String[] args) {
      LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = current.format(formatter);

        System.out.println("Current Date is: " + formatted);
    }
}
