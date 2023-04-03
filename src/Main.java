import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

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
                lines.add(line);
            }

            boolean isNumericLine = true;
            for (String eachLine : lines) {
                for (char c : eachLine.toCharArray()) {
                    if (!Character.isDigit(c) && c != ' ' && c != '-') {
                        isNumericLine = false;
                        break;
                    }
                }
                if (isNumericLine) {
                    System.out.println(eachLine);
                } else {
                    String[] words = eachLine.split(" ");
                    Collections.reverse(Arrays.asList(words));
                    String reversedLine = String.join(" ", words);
                    lines.add(reversedLine);
                }
            }
            reader.close(); // close a file

            System.out.print("Enter the name of the output file: ");
            String outputFileName = in.next();
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            for (String reversedLine : lines) {
                writer.write(reversedLine + "\n");
            }
            writer.close();
        } catch (Exception err) {
            System.out.println("Error: ");
        }
    }
}