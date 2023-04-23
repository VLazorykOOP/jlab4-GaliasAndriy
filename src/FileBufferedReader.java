import java.util.ArrayList;
import java.io.*;

public class FileBufferedReader {
    public static void moveLinesIntoArrayList(ArrayList<String> lines, String fileName)
            throws IOException {
        // open a file for reading
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue; // skip empty lines
            }
            lines.add(line);
        }
        reader.close(); // close a file
    }
    public static int countCharacters(ArrayList<String> lines) {
        int count = 0;
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String s : words) {
                if (!s.contains("\r") && !s.contains("\n")) {
                    count += s.length();
                }
            }
        }
        return count;
    }
}
