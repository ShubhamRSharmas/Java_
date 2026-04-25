package collections;

import java.util.ArrayList;

public class ListPractice
{
    public static void main(String args[])
    {
        //Create a list to store student names
        ArrayList<String> studentNames = new ArrayList<>();

        //Add names to the list
        studentNames.add("Shubham");
        studentNames.add("Rahul");
        studentNames.add("Shubham"); //Lists allow duplicates

        //Print the list
        System.out.println("Student list: " + studentNames);

        //Access the first student
        System.out.println("First student: " + studentNames.get(0));
    }
}