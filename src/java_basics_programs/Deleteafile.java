package java_basics_programs;

import java.io.File;

public class Deleteafile {
    public static void main(String[] args) {

        // creates a file object
        File file = new File("C:\\Users\\muttu\\OneDrive\\Desktop\\New folder\\abc.txt");

        // deletes the file
        boolean value = file.delete();
        if(value) {
            System.out.println("JavaFile.java is successfully deleted.");
        }
        else {
            System.out.println("File doesn't exit");
        }
    }
}
