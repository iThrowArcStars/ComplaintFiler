import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    // Creates a file (Totally useless I just wanted to see if I could do it.)
    public static void createFile() {
        try {
            File storedData = new File("storedData.csv");
            if (storedData.createNewFile()) {
                MyUtility.log("File created: " + storedData.getName());
            } else {
                MyUtility.log("That file already exists. ");
            }
        } catch (IOException e) {
            MyUtility.log("There has been an error. ");
            e.printStackTrace();
        }
    }
    public static void writeToFile(String dataToWrite) {
        try {
            FileWriter data = new FileWriter("storedData.csv", true);
            data.write(dataToWrite);
            data.close();
            MyUtility.log("Data has successfully been recorded. ");
        } catch (IOException e) {
            MyUtility.log("An error has occured. ");
            e.printStackTrace();
        }
    }
}
