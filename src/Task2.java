import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task2 {
    public static void task2() {
        System.out.println(" Testing a files from ./uploads folder ");
        String folderPath = "D:/Java_labs/lab4_files/jlab4-GaliasAndriy/uploads";
        File folder = new File(folderPath);

        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

        for (File file : files) {
            if (file.isFile()) {
                try {
                    String content = file.getAbsolutePath();
                    ArrayList<String> lines = new ArrayList<String>();
                    FileBufferedReader.moveLinesIntoArrayList(lines, content); // arraylist

                    int count = FileBufferedReader.countCharacters(lines);
                    System.out.println(file.getName() + " contains " + count + " characters.");
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }
    }
}