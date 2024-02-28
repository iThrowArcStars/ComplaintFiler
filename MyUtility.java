import java.util.Scanner;

public class MyUtility {
    // Shortens System.out.println(); to log();
    public static void log(String txt) {
        System.out.println(txt);
    }

    private static Scanner scanner = new Scanner(System.in);
    
    // readLine();
    public static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
    
    // readInt();
    public static int readInt(String question) {
        System.out.println(question);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Clear the scanner buffer
            return -1;
        }
    }
}