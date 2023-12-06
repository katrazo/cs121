package weekOne;

public class Kat {
    public static void main(String[] args) {
        // variable declaration
        // int age;
        // variable initialization
        // age = 18;

        // variable declaration and initialization
        int age = 18;
        double gpa = 4.1;
        char letterGrade = 'A';
        boolean csMajor = true;
        String firstName = "Kat";

        String formatted = ("\nStudent name: " + firstName + "\nStudent age: " + age + "\nStudent gpa/letter grade: " + gpa + " / " + letterGrade + "\nIs " + firstName + " a CS Major?: " + csMajor);
        System.out.println(formatted);

        System.out.println("\nAdditional Information:");
        int pets = 2;
        String favVideoGame = "UnderMine";
        int rememberedPiDigits = 8;

        System.out.printf("%s remembers %d digits of pi: %.8f%n", firstName, rememberedPiDigits, Math.PI);
        System.out.printf("%s's favorite video game (right now) is \"%s\"%n", firstName, favVideoGame);
        System.out.printf("%s has %d pets%n", firstName, pets);
    }
}
