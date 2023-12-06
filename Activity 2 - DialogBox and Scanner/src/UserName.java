import javax.swing.JOptionPane;

public class UserName {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name.");

        String uppercase = name.toUpperCase();

        String lowercase = name.toLowerCase();

        StringBuilder reverse = new StringBuilder(name).reverse();

        JOptionPane.showMessageDialog(null, "Uppercase: " + uppercase + "\nLowercase: " + lowercase + "\nReverse: " + reverse);
    }
}