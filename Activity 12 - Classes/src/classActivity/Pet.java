package classActivity;

// One of the two different classes to be instantiated
// This class represents a house pet.
public class Pet {
    private String animalType;
    private String name;
    private int age;
    private String favoriteFood;

    // This constructor utilizes different parameter names.
    public Pet(String type, String n, int a, String favFood) {
        animalType = type;
        name = n;
        age = a;
        favoriteFood = favFood;
    }

    // Called by the Household.toString() method (which is why it is not called in Main.main())
    public String getName() {
        return name;
    }

    public String toString() {
        return name + " the " + animalType + " is " + age + " years old and likes to eat " + favoriteFood + ".";
    }
}
