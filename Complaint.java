
public class Complaint
{
    private int caseID;
    private String userName;
    private String userComplaint;

    // The constructor
    public Complaint() {
        int caseID = (int) (Math.random() * 100000000 + 999999999);
        String userName = MyUtility.readLine("Enter your name: ");
        String userComplaint = MyUtility.readLine("Complaint: ");
        this.caseID = caseID;
        this.userName = userName;
        this.userComplaint = userComplaint;
    }
}
