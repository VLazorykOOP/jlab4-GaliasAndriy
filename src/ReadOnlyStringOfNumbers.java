/*
import java.util.ArrayList;

public class ReadOnlyStringOfNumbers {
    public static void printStringsOfNumbers(ArrayList<String> lines) {
        for (String line : lines) {
            boolean flag = false;
            for (char c : line.toCharArray()) {
                if (!Character.isDigit(c) && c != ' ') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(line);
            } else {
                System.out.println("non-numeric line: " + line);
            }
        }
    }
}
*/

