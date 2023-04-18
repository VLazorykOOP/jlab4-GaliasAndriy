import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static Scanner in = new Scanner(System.in);
    public static void task1() {
        System.out.println(" Enter file that you want to test:");
        System.out.println("    1) ./uploads/test.txt ");
        System.out.println("    2) ./uploads/tmp.txt ");

        try {
            System.out.print(" Your choice: ");
            String fileName = in.next();

            // open a file for reading
            ArrayList<String> lines = new ArrayList<String>();
            FileBufferedReader.moveLinesIntoArrayList(lines, fileName); // Move file lines of data in ArrayList

            System.out.println("Enter name for a file with reversed lines: ");
            System.out.println(" It should be saved inside a folder ./saves/ ");
            System.out.print(" Enter file name: ");
            fileName = in.next();
            in.close();

            SumLinesOfIntegers.checkEveryLine(lines, fileName); // Check every line in ArrayList on consisting of Integers

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + e.getMessage() + " was not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
