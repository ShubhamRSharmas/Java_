package collections;

import java.util.HashSet;

class SetPractice
{
    public static void main(String args[])
    {
        //Create a HashSet
        HashSet<String> uniqueNames = new HashSet<>();

        //Add names
        uniqueNames.add("Shubham");
        uniqueNames.add("Rahul");
        uniqueNames.add("Shubham"); //This will be ignored. No Duplicates allowed in HashSet

        //Print the set
        System.out.println("Unique names: " + uniqueNames);

        //Checking if an item exists (Very fast!)
        boolean hasShubham = uniqueNames.contains("Shubham");
        System.out.println("Contains Shubham? " + hasShubham);
    }
}