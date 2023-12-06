package weekTwo;

import javax.swing.JOptionPane;

public class DialogTest {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name:");
        System.out.println("Hello, " + name + "!");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
