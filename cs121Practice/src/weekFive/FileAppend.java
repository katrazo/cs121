package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        try{
            // Create an Instance of FileWriter and PrintWriter class
            FileWriter fileWrite = new FileWriter("courses.txt",true);
            PrintWriter printWrite = new PrintWriter(fileWrite);

            String course = JOptionPane.showInputDialog("Enter Course Name:");
            String credits = JOptionPane.showInputDialog("Enter Course Credits:");
            String score = JOptionPane.showInputDialog("Enter Course Score:");

            printWrite.printf("%s %s %s",course,credits,score);

            fileWrite.close();
            printWrite.close();
        }catch(FileNotFoundException e){
            System.err.println("oopsie poopsie");
        }
    }
}
