package encapsulation;

// 'extends' is the keyword for Inheritance
public class ScholarshipStudent extends Student
{
    private double grantAmount;

    public ScholarshipStudent()
    {

    }
    public ScholarshipStudent(String name, int rollNumber, double grantAmount)
    {
        super(name, rollNumber); //This calls the Parent Constructor
        this.grantAmount = grantAmount;
    }

    public void setGrantAmount(double grantAmount)
    {
        this.grantAmount = grantAmount;
    }

    public void displayGrant()
    {
        //We can use "getName()" because we inherited it from Student class
        System.out.println(getName() + " has a grant of: " + grantAmount);
    }
}
