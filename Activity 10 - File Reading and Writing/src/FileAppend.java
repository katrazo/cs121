import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        File textFile = new File("C:\\Users\\razoc\\OneDrive\\Desktop\\cs121\\Activity 10 - File Reading and Writing\\src\\textFile");
        FileWriter fileWriter = new FileWriter(textFile, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Three times
        for (int i = 0; i < 3; i++) {
            String name = JOptionPane.showInputDialog("Please enter a name:");
            int favNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter " + name + "'s favorite number:"));
            String favColor = JOptionPane.showInputDialog("Please enter " + name + "'s favorite color:");
            printWriter.printf("%s %d %s\n", name, favNumber, favColor);
        }

        printWriter.close();
        fileWriter.close();
    }
}
