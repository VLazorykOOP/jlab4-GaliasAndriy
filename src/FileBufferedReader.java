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
    public static int countCharacters(String fileName) throws IOException{
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int c;
        boolean skipNextChar = false;
        while ((c = reader.read()) != -1) {
            if (skipNextChar){
                skipNextChar = false;
                if (c == '\n') {
                    continue;
                }
            }
            if (c == '\r') {
                skipNextChar = true;
                continue;
            }
            if (!Character.isWhitespace(c) && c!= '^') {
                count++;
            }
        }
        reader.close();
        return count;
    }
}
