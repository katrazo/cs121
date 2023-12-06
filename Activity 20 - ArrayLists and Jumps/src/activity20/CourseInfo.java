package activity20;
import week10.ArrayListDemo;

import java.io.PrintWriter;

public class CourseInfo {
    private ArrayListDemo demo = new ArrayListDemo();

    public void addToEachList( String name, int score, char letterGrade, double gpa) {
        demo.addName(name);
        demo.addScore(score);
        demo.addLetterGrade(letterGrade);
        demo.addGPA(gpa);
    }

    public void printToTable(PrintWriter printWriter) {
        printWriter.printf("%-10s %-10s %-10s %-10s%n", "Name", "Score", "Grade", "GPA");
        // our only method adds an entry to ALL lists, so they should all be the same length.
        for (int i = 0; i < demo.getSizeOfScoreList(); i++) {
            printWriter.printf("%-10s %-10d %-10c %-10.1f%n", demo.getName(i), demo.getScore(i), demo.getLetterGrade(i), demo.getGPA(i));
        }
    }

    public ArrayListDemo getDemo() {
        return demo;
    }
}
