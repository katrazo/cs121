import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nThis word game requires some information.\nPlease enter each of the following one at a time.");
        String name, age, city, college, major, animal, petName;

        // Prompt
        System.out.println("\nName:");
        // User answer
        name = userInput.nextLine();

        System.out.println("\nAge:");
        age = userInput.nextLine(); // using an int only can cause an InputMisMatchException, and try,catch blocks with Scanners are a nightmare.

        System.out.println("\nCity:");
        city = userInput.nextLine();

        System.out.println("\nCollege:");
        college = userInput.nextLine();

        System.out.println("\nMajor:");
        major = userInput.nextLine();

        System.out.println("\nAnimal Type:");
        animal = userInput.nextLine();

        System.out.println("\nPet's Name: (Don't have one? Make it up!)");
        petName = userInput.nextLine();

        System.out.println("\nThat's all! Press Enter to view your story.");
        String pause = userInput.nextLine(); // exists only to pause the code

        System.out.printf("\nThere once was a person named %s who lived in %s.\nAt the age of %s, %s went to college at %s.\n%s graduated with a %s.\nThen, %s adopted a(n) %s named %s.\nThey both lived happily ever after!\n", name, city, age, name, college, name, major, name, animal, petName);

    }
}