package classActivity;

// This class instantiates the other two with a main() method.
public class Main {
    public static void main(String[] args) {
        Pet Smokey = new Pet("dog","Smokey",9,"bacon");
        System.out.println(Smokey.toString() + "\n");
        // System.out.println(Smokey); does the same thing because the toString() method is internally supported by Java.

        Household myHouse = new Household("Dorm 837B","Kat R.",2);
        System.out.println(myHouse.toString());
        Household oldHouse = new Household("The Hudson House","Sarah H.",2,Smokey);
        // As previously stated, the call to *.toString() is redundant. See below:
        System.out.println(oldHouse);

        System.exit(0);
    }
}
