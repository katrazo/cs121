import javax.swing.JOptionPane;

public class WordGameDialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"\nThis word game requires some information.\nPlease enter each of the following one at a time.");
        String name, age, city, college, major, animal, petName;

        name = JOptionPane.showInputDialog("Please enter your name:");

        age = JOptionPane.showInputDialog("Please enter your age:");

        city = JOptionPane.showInputDialog("Please enter your city:");

        college = JOptionPane.showInputDialog("Please enter your college:");

        major = JOptionPane.showInputDialog("Please enter your major:");

        animal = JOptionPane.showInputDialog("Please enter your favorite animal.");

        petName = JOptionPane.showInputDialog("Please enter your pet's name.\n(Don't have one? Make it up!)");

        JOptionPane.showMessageDialog(null, "Your story is ready! Press Enter to continue.");

        JOptionPane.showMessageDialog(null,"\nThere once was a person named " + name + " who lived in " + city + ".\nAt the age of " + age + ", " + name + " went to college at " + college + ".\n" + name + " graduated with a " + major + ".\nThen, " + name + " adopted a(n) " + animal + " named " + petName + ".\nThey both lived happily ever after!\n");

    }
}