package encapsulation;

import encapsulation.Student;

public class Main
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.setName("Bruce");
        s.setRollNumber(103);

        s.setName("John");
        s.setRollNumber(104);

        System.out.println(s.getName());
        System.out.println(s.getRollNumber());
    }
}
