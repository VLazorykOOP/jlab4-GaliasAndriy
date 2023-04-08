import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Lab4 Java ");
        System.out.println("  Menu: ");
        System.out.println("  1) Task 1 (Sum of lines and reversed lines)");
        System.out.println("  2) Task 2 (Count a characters in a file)");
        System.out.println("  3) Exit from a menu (or 'e')");
        String c;
        do {
            System.out.print("  Your choice: ");
            c = in.next();
            switch (c) {
                case "1":
                    Task1.task1();
                    break;
                case "2":
                    Task2.task2();
                    break;
                case "3":
                case "e":
                case "q":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong character. Try again!");
                    break;
            }
        } while (true);
    }
}