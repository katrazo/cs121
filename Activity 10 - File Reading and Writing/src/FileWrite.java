import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        File textFile = new File("C:\\Users\\razoc\\OneDrive\\Desktop\\cs121\\Activity 10 - File Reading and Writing\\src\\textFile");
        PrintWriter printWriter = new PrintWriter(textFile);

        printWriter.println("name favNumber favColor");

        // Three times
        for (int i = 0; i < 3; i++) {
            String name = JOptionPane.showInputDialog("Please enter a name:");
            int favNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter " + name + "'s favorite number:"));
            String favColor = JOptionPane.showInputDialog("Please enter " + name + "'s favorite color:");
            printWriter.printf("%s %d %s\n", name, favNumber, favColor);
        }

        // If you don't close it, it won't finish writing. The file will be empty!
        printWriter.close();
    }
}
