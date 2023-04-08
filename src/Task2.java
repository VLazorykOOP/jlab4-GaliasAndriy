import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void task2() {
        System.out.println(" Testing a files from ./upload folder ");
        String folderPath = "./uploads";
        File folder = new File(folderPath);

        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

        for (File file : files) {
            if (file.isFile()) {
                try {
                    int count = FileBufferedReader.countCharacters(file.getPath());
                    System.out.println(file.getName() + " contains " + count + " characters.");
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }
    }
}













//    File folder = new File(folderPath);
//
//        File[] files = folder.listFiles();
////        for (int i = 0; i < files.length; i++) {
////            System.out.println(files[i]);
////        }
//
//        for (File file : files) {
//            if (file.isFile()) {
//                try {
//                    FileReader reader = new FileReader(file);
//                    int count = 0;
//                    int data;
//                    while ((data = reader.read()) != -1) {
//                        count++;
//                    }
//                    reader.close();
//                    System.out.println(file.getName() + ": " + count + " characters");
//                } catch (IOException e) {
//                    System.out.println("Error reading file: " + e.getMessage());
//                }
//            }
//        }