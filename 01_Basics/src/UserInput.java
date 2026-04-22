import java.util.Scanner; //Import the Scanner class

class UserInput {
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in); //Create a Scanner Object

        System.out.println("Enter your age: ");
        int userAge = myObj.nextInt(); //Read User Input

        System.out.println("Your age is: " + userAge);

        myObj.close(); //Good Practice: close the Scanner
    }
}