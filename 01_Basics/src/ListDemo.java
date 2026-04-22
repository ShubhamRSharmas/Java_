import java.util.ArrayList;

class ListDemo
{
    public static void main(String args[])
    {
        //We must specify the type: ArrayList<String>
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Python");
        languages.add("Java");
        languages.add("Javascript");

        //Print the whole list
        System.out.println("Languages: " + languages);

        //Get an item (like index in Python)
        System.out.println("First Language: " + languages.get(0));

        //Remove an item
        languages.remove("Python");
        System.out.println("Updated list: " + languages);
    }
}