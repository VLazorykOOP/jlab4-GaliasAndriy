import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class SumLinesOfIntegers {
    public static void checkEveryLine(ArrayList<String> lines, String reversedFile) {
        FileWriter saveFile = null;
        System.out.println("tmp");
        try {
            saveFile = new FileWriter(reversedFile);

            for (String l : lines) {
                String[] tmp = l.split(" ");
                boolean isIntegerLine = true;
                int sum = 0;
                System.out.println(tmp);
                for (String s : tmp) {
                    try {
                        int num = Integer.parseInt(s);
                        sum += num;
                    } catch (NumberFormatException e) {
                        System.out.println("Line " + l + " contains a non-integer value: " + e.getMessage());
                        isIntegerLine = false;
                        break;
                    }
                }

                if (isIntegerLine) {
                    System.out.println(l + " | sum = " + sum + " | ");
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i = tmp.length - 1; i >= 0; i--) {
                        sb.append(tmp[i]).append(" ");
                    }
                    String reversedLine = sb.toString().trim();
                    saveFile.write(reversedLine + "\n");
                }
            }} catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());

        } finally {
            try {
                if (saveFile != null) {
                    saveFile.close(); // close the FileWriter
                }
            } catch (IOException e) {
                System.out.println("Error closing FileWriter: " + e.getMessage());
            }
        }
    }
}