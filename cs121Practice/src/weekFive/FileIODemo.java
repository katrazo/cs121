package weekFive;

import java.io.File;
import java.io.FileNotFoundException; // Added for Scanner-ing a file
import java.util.Scanner;


public class FileIODemo {
    public static void main(String[] args) throws FileNotFoundException {
        // Create Instance
        // File file = new File("courses.txt"); // Relative Path
        File absFile = new File ("C:\\Users\\razoc\\OneDrive\\Desktop\\cs121\\cs121Practice\\src\\weekFive\\courses.txt"); // Absolute Path

        try {
            // Read File by using Scanner
            Scanner fileReader = new Scanner(absFile);
            String header = fileReader.nextLine();
            System.out.println(header);
            System.out.println(" ----------------------");
             // Throw Exception
            while (fileReader.hasNextLine()) {
                // Variables
                /* String line = fileReader.nextLine();
                 * System.out.println(line);
                 */
                String course = fileReader.next();
                int credits = Integer.parseInt(fileReader.next());
                int score = Integer.parseInt(fileReader.next());
                System.out.printf(" %-8s %4d %8d \n",course,credits,score);
            }
        }catch(FileNotFoundException e){
            System.err.println("File " + absFile + " not found, please check path.");
        }
    }
}
