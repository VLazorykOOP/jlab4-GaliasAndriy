import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Lab4 Java ");
        Scanner in = new Scanner(System.in); // object for choosing a file by user
        try {
            System.out.println(" Enter file that you want to test:");
            System.out.println("    1) ./uploads/test.txt ");
            System.out.print(" Your choice: ");
            String fileName = in.next();

            // open a file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            ArrayList<String> lines = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // skip empty lines
                }
                lines.add(line);
            }
            reader.close(); // close a file

            for (String l : lines) {
                String[] tmp = l.split(" ");
                boolean isIntegerLine = true;
                for (String s : tmp) {
                    try {
                        Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Line " + l + " contains a non-integer value: " + e.getMessage());
                        isIntegerLine = false;
                        break;
                    }
                }
                if (isIntegerLine) {
                    System.out.println(l);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file " + e.getMessage() + " was not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}