import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // For some reason, using the relative path "textFile" throws a FileNotFound Exception every time

            // The following line throws FileNotFoundException when using relative path "textFile". Is it my PC in particular?
            File textFile = new File("C:\\Users\\razoc\\OneDrive\\Desktop\\cs121\\Activity 10 - File Reading and Writing\\src\\textFile");
            Scanner fileReader = new Scanner(textFile);

            while (fileReader.hasNextLine())
                System.out.println(fileReader.nextLine());

            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found. See the following error for more:");
            System.err.println(e); // Hides stacktrace, but printing the stacktrace in and of itself is somewhat advanced
            System.exit(1);
        }
    }
}
