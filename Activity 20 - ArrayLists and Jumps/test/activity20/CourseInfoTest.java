package activity20;

import org.junit.jupiter.api.Test;
import week10.ArrayListDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CourseInfoTest {
    CourseInfo courseInfoTest = new CourseInfo();

    @Test
    void addToEachList() {
        courseInfoTest.addToEachList("CS 121", 98, 'A', 3.8);
        assertEquals("CS 121", courseInfoTest.getDemo().getName(0));
        assertEquals(98, courseInfoTest.getDemo().getScore(0));
        assertEquals('A', courseInfoTest.getDemo().getLetterGrade(0));
        assertEquals(3.8, courseInfoTest.getDemo().getGPA(0));
    }

    // DON'T EVER DO THIS IN A TESTING FRAMEWORK THIS IS SUPER NOT HOW TO DO IT
    // The assignment just kinda worked out weird.
    public static void main(String[] args) throws IOException {
        CourseInfo forTable = new CourseInfo();
        Scanner userInput = new Scanner(System.in);

        // Writes to a new file called CourseInfoTable.txt
        FileWriter fileWriter = new FileWriter("CourseInfoTable.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        while (true) {
            System.out.println("Enter a name or press q to quit.");
            String name = userInput.nextLine();
            if (name.equals("q"))
                break;
            forTable.getDemo().addName(name);

            System.out.println("Enter a score <integer>:");
            int score = Integer.parseInt(userInput.nextLine());
            forTable.getDemo().addScore(score);

            System.out.println("Enter a letter grade <character>:");
            char letterGrade = userInput.nextLine().charAt(0);
            forTable.getDemo().addLetterGrade(letterGrade);

            System.out.println("Enter a GPA <double>:");
            double gpa = Double.parseDouble(userInput.nextLine());
            forTable.getDemo().addGPA(gpa);
        }

        forTable.printToTable(printWriter);
        printWriter.close();
        fileWriter.close();
        userInput.close();
    }
}