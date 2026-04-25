package collections;
//Abstract class
class Student
{
    String name;
    int rollNumber;

    //No-arguments Constructor
    public Student()
    {
        //No argument Constructor
    }

    //Parameterized Constructor
    public Student(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName()
    {
        return name;
    }
    public void displayDetails()
    {
        System.out.println("Name: " + name + "\n" + "Roll Number: " + rollNumber);
    }
}