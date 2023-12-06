import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int numOfStudents;
        int testsPerStudent;
        int currentStudentSum;
        double currentStudentAverage;

        System.out.println("Enter number of students");
        numOfStudents = userInput.nextInt();
        System.out.println("Enter number of tests per student");
        testsPerStudent = userInput.nextInt();

        for (int i = 1; i <= numOfStudents; i++) {
            System.out.println("\nStudent number " + i);
            System.out.println("-------------------");
            currentStudentSum = 0;
            currentStudentAverage = 0;

            for (int j = 1; j <= testsPerStudent; j++) {
                System.out.print("Enter score " + j + ": ");
                currentStudentSum += userInput.nextInt();
            }

            currentStudentAverage = (double)currentStudentSum / testsPerStudent;
            System.out.printf("The average for student %d is %.2f\n", i, currentStudentAverage);
        }
    }
}
