import java.util.HashMap;

class MapDemo
{
    public static void main(String args[])
    {
        //Create a HashMap to store language proficiency (Key: Language, Value: Level)
        HashMap<String, String> proficiency = new HashMap<>();

        //Add Items
        proficiency.put("Python", "Expert");
        proficiency.put("Java", "Beginner");

        System.out.println("HashMap : "+  proficiency);

        //Access an item
        System.out.println("Java proficiency: " + proficiency.get("Java"));

        //Remove an item
        proficiency.remove("Python");

        System.out.println("Remaining map: " + proficiency);
    }
}