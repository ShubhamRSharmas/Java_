package encapsulation;

class Student
{
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

    //1. Make Data private
    private String name;
    private int rollNumber;

    //2. Public Getter
    public String getName()
    {
        return name;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    //3. Public Setter with Validation logic
    public void setName(String name)
    {
        this.name = name;
    }

    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }
}