package encapsulation;
import java.util.ArrayList;
import encapsulation.Student;

public class Main
{
    public static void main(String args[])
    {
//        Student s = new Student();
//
//        s.setName("Bruce");
//        s.setRollNumber(103);
//
//        System.out.println(s.getName());
//        System.out.println(s.getRollNumber());
//
//        s.setName("John"); //Bruce got overwritten by "John"
//        s.setRollNumber(104); //103 got overwritten by 104
//
//        System.out.println(s.getName());
//        System.out.println(s.getRollNumber());

        //To print all students and rollNumber we need to store them in an ArrayList
//        ArrayList<Student> list = new ArrayList<>();
//
//        Student s1 = new Student();
//        s1.setName(s.getName()); //Same as s1.setName("John")
//        s1.setRollNumber(s.getRollNumber()); //Same as s1.setRollNumber(104)
//        list.add(s1);
//
//        Student s2 = new Student();
//        s2.setName("Bruce");
//        s2.setRollNumber(103);
//        list.add(s2);

//        for(Student i: list)
//        {
//            System.out.println(i.getName()+","+i.getRollNumber());
//        }

        //To test Inheritance:
        System.out.println("Inheritance");

        ScholarshipStudent ss = new ScholarshipStudent();
        ss.setName("Alice"); //Method from Parent
        ss.setGrantAmount(5000.0); //Method from Child
        ss.displayGrant();

        //Polymorphism
//        System.out.println("SubType Polymorphism"); //As Scholarship is a child class of Student class it is a type of Student Object and it can be added in a ArrayList that accepts Student type Objects.
//        ArrayList<Student> allStudents = new ArrayList<>();
//        allStudents.add(new Student("Normal", 101));
//        allStudents.add(new ScholarshipStudent("ad",12,8.7)); //Yes this works!

//        for (Student i: allStudents)
//        {
//            System.out.println(i.getName());
//        }

//        System.out.println("Polymorphism - Method Overriding | Dynamic Polymorphism | Runtime Polymorphism");

        //Polymorphism - Method Overriding | Dynamic Polymorphism | Runtime Polymorphism
//        for (Student i : allStudents)
//        {
//            //Java automatically calls the correct version of method - If Student object, it's method will work if ScholarshipStudent then it's method will be called
//            i.displayDetails();
//        }

        //Abstraction
        System.out.println(ss.calculateFees());

    }
}
