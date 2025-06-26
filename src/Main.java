// Syntax: Every Java program starts with a class
public class Main {

    // Syntax: main() is the entry point of every Java application
    public static void main(String[] args) {

        // VARIABLES + DATA TYPES
        // Declare a String variable to store name
        String name = "Badmus";

        // Declare an integer variable for age
        int age = 17;

        // Declare a double variable for account balance
        double accountBalance = 1234.56;

        // Declare a boolean variable to represent student status
        boolean isStudent = true;

        // Print all the variables
        System.out.println("Name: " + name);             // Concatenation
        System.out.println("Age: " + age);
        System.out.println("Account Balance: ₦" + accountBalance);
        System.out.println("Are you a student? " + isStudent);

        // CONDITIONAL STATEMENT (BONUS)
        if (age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is a minor.");
        }

        // LOOPS
        // Using a for loop to repeat a task
        System.out.println("\n--- Looping Through Days ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Learning Java - Day " + i);
        }

        // FUNCTION (called Method in Java)
        // Calling a method that displays user info
        displayInfo(name, age, isStudent);
    }

    // FUNCTIONS
    // A custom method to display user information
    public static void displayInfo(String username, int userAge, boolean studentStatus) {
        System.out.println("\n--- Display Info Function ---");
        System.out.println("Name: " + username);
        System.out.println("Age: " + userAge);
        System.out.println("Student: " + studentStatus);
    }
}
