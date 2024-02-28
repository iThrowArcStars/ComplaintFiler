
public class Complaint
{
    private int caseID;
    private String userName;
    private String userComplaint;

    // The constructor
    public Complaint() {
        caseID = (int) (Math.random() * 100000000 + 999999999);
        userName = MyUtility.readLine("Enter your name: ");
        userComplaint = MyUtility.readLine("Complaint: ");
    }

    // Formats the program to a CSV type structure
    public String toCSV() {
        return String.format("%s,%d,%s", userName, caseID, userComplaint);
    }
}
