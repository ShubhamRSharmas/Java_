package encapsulation;

// 'extends' is the keyword for Inheritance
public class ScholarshipStudent extends Student
{
    private double grantAmount;

    public ScholarshipStudent()
    {
        //No-arguments Contructor
    }
    //Parameterized Constructor
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

    //Polymorphism - Method Overriding [A child class provides a specific implementation for a method that is already defined in its Parent class]
    @Override //says: "I am intentionally replacing the parent's version of this method."
    public void displayDetails()
    {
        //Call the parent's version first (optional but good practice)
        System.out.println("Scholarship ");
        super.displayDetails();
        System.out.println("Grant: " + grantAmount);
    }

    //Abstraction - Implementation of abstract Method
    @Override
    public double calculateFees()
    {
        return baseFee - this.grantAmount;
    }
}
