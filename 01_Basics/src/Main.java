import java.util.ArrayList;

class Main
{
    public static void main(String args[])
    {
        Student s1 = new Student("Shubham", 101);
        s1.displayInfo();

        //1.) Create an ArrayList of Student objects
        ArrayList<Student> s2 = new ArrayList<>();

        //2.) Add at least 2 different students to that list.
        s2.add(new Student("Ajay", 102));
        s2.add(new Student("Brijesh", 103));

        //3.) Use a for-each loop to print the info for all students in the list
        for (Student i:s2)
        {
            i.displayInfo();
        }
    }
}