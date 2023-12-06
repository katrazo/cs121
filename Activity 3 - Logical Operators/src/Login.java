import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String userName = "krazo";
        String password = "coding_15_fun";

        String name = JOptionPane.showInputDialog("Please enter your username:");
        String pw = JOptionPane.showInputDialog("Please enter your password:");

        if (name.equals(userName) && pw.equals(password))
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        else if (name.equals(userName))
            JOptionPane.showMessageDialog(null, "Password '" + pw + "' is incorrect.");
        else if (pw.equals(password))
            JOptionPane.showMessageDialog(null, "Username '" + name + "' is incorrect.");
        else
            JOptionPane.showMessageDialog(null, "Username '" + name + "' is incorrect.\nPassword '" + pw + "' is incorrect.");
    }
}
