package collections;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String args[])
    {
        //Map<Key, Value>
        Map<Integer, Student> studentMap = new HashMap<>();

        //Adding Entries
        studentMap.put(101, new ScholarshipStudent("Shubham", 101, 2000));
        studentMap.put(102, new Student("Rahul", 102));
        studentMap.put(103, new Student("Ramesh", 103));

        //Retrieving by Key
        int searchId = 999;
        Student s = studentMap.get(searchId);

        if (s != null)
        {
            s.displayDetails();
        }
        else
        {
            System.out.println("Student not found!");
        }
    }
}