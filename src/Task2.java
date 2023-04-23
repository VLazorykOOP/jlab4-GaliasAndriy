import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Task2 {
    public static void task2() {
        System.out.println(" Testing a files from ./uploads folder ");
        String folderPath = "D:/Java_labs/jlab4-GaliasAndriy/uploads";
        File folder = new File(folderPath);


        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
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
}