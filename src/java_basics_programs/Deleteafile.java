package java_basics_programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class MaDeleteafilein {
    public static void main(String[] args) {

        try {
            // creates a file object
            Path path = Paths.get("C:\\Users\\muttu\\OneDrive\\Desktop\\New folder\\abc.txt");

            // deletes the file
            boolean value = Files.deleteIfExists(path);
            if(value) {
                System.out.println("JavaFile.java is successfully deleted.");
            }
            else {
                System.out.println("File doesn't exit");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}


