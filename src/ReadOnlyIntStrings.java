import java.util.ArrayList;

public class ReadOnlyIntStrings {
    public static void printStringOfNumbers(ArrayList<String> list){
        for (String l : list) {
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
    }
}