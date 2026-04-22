package encapsulation;

// 'extends' is the keyword for Inheritance
public class ScholarshipStudent extends Student
{
    private double grantAmount;

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
