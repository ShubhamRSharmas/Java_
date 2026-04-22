class Student
{
    String name;
    int rollNumber;

    // A Constructor: Sets initial values when creating an object
    public Student(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayInfo()
    {
        System.out.println("Name: " + name + ", Roll: " + rollNumber);
    }
}
