package classActivity;

// One of the two different classes to be instantiated
// This class represents a household and those residing in it.
public class Household {
    private String householdName;
    private String ownerName;
    private int numOfPeople;
    private Pet pet; // Household can only have one pet because I don't want to use an array for this haha

    // This constructor uses the same names for parameters and variables, so it uses the "this" keyword to construct objects.
    public Household(String householdName, String ownerName, int numOfPeople, Pet pet) {
        this.householdName = householdName;
        this.ownerName = ownerName;
        this.numOfPeople = numOfPeople;
        this.pet = pet;
    }

    // This constructor is overloaded so that a pet is not required.
    public Household(String householdName, String ownerName, int numOfPeople) {
        this.householdName = householdName;
        this.ownerName = ownerName;
        this.numOfPeople = numOfPeople;
        this.pet = null;
    }

    public String toString() {
        if (pet != null)
            return "The " + householdName + " is owned by " + ownerName + ", has " + numOfPeople + " people in it, and has a pet named " + pet.getName() + ".";
        else
            return "The " + householdName + " is owned by " + ownerName + " and has " + numOfPeople + " people in it.";
    }
}
