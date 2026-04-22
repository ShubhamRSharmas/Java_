package encapsulation;
import java.util.ArrayList;

import encapsulation.Student;

public class Main
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.setName("Bruce");
        s.setRollNumber(103);

        System.out.println(s.getName());
        System.out.println(s.getRollNumber());

        s.setName("John"); //Bruce got overwritten by "John"
        s.setRollNumber(104); //103 got overwritten by 104

        System.out.println(s.getName());
        System.out.println(s.getRollNumber());

        //To print all students and rollNumber we need to store them in an ArrayList
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student();
        s1.setName(s.getName()); //Same as s1.setName("John")
        s1.setRollNumber(s.getRollNumber()); //Same as s1.setRollNumber(104)
        list.add(s1);

        Student s2 = new Student();
        s2.setName("Bruce");
        s2.setRollNumber(103);
        list.add(s2);

        for(Student i: list)
        {
            System.out.println(i.getName()+","+i.getRollNumber());
        }

    }
}
