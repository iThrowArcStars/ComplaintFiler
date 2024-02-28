/** 
 * 022724
 * 
 * Justin Fithian
 * Michael Gisi (discord if you want to message me: @michael_the_2nd)
 * McClain Larreau
 * Austin Uhl
 * 
 * Roberts
 * 
**/


public class main {
    public static void main(String[] args) {
        // Example usage of log() : MyUtility.log("Hello, world!");
        
        //String userID = MyUtility.readLine("Enter your User ID: ");
        //Complaint complaint = new Complaint();
        MyUtility.createFile();
        Complaint complaint = new Complaint();
        MyUtility.writeToFile(complaint.toCSV() + "\n");
    }
}