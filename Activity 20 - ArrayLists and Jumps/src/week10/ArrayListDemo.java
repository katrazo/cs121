package week10;

import java.util.ArrayList;

public class ArrayListDemo {
    private ArrayList<Integer> scores = new ArrayList<>();
    private ArrayList<Character> letterGrades = new ArrayList<>();;
    private ArrayList<Double> gpas = new ArrayList<>();;
    private ArrayList<String> names = new ArrayList<>();;

    // -=-=- Scores -=-=-
    // Mutators
    public void addScore(int score) {
        scores.add(score);
    }

    public void removeScore(int score) {
        scores.remove(score);
    }

    // Accessors
    public int getScore(int index) {
        return scores.get(index);
    }

    public int getSizeOfScoreList() {
        return scores.size();
    }

    // Display Methods
    public void displayScores1() {
        System.out.printf("Scores:%n");
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%d ", scores.get(i));
        }
    }
    public void displayScores2() {
        System.out.printf("Scores (Enhanced):%n");
        for (int score: scores) {
            System.out.printf("%d ", score);
        }
    }

    // -=-=- -=-=- -=-=- -=-=-

    // -=-=- Letter Grades -=-=-
    // Mutators
    public void addLetterGrade(char letterGrade) {
        letterGrades.add(letterGrade);
    }

    public void removeLetterGrade(int letterGrade) {
        scores.remove(letterGrade);
    }

    // Accessors
    public char getLetterGrade(int index) {
        return letterGrades.get(index);
    }

    public int getSizeOfLetterGradeList() {
        return letterGrades.size();
    }

    // Display Methods
    public void displayLetterGrades1() {
        System.out.printf("Grades:%n");
        for (int i = 0; i < letterGrades.size(); i++) {
            System.out.printf("%c ", letterGrades.get(i));
        }
    }
    public void displayLetterGrades2() {
        System.out.printf("Grades (Enhanced):%n");
        for (int letterGrade: letterGrades) {
            System.out.printf("%c ", letterGrade);
        }
    }

    // -=-=- -=-=- -=-=- -=-=-

    // -=-=- GPAs -=-=-
    // Mutators
    public void addGPA(double gpa) {
        gpas.add(gpa);
    }

    public void removeGPA(double gpa) {
        gpas.remove(gpa);
    }

    // Accessors
    public double getGPA(int index) {
        return gpas.get(index);
    }

    public int getSizeOfGPAList() {
        return gpas.size();
    }

    // Display Methods
    public void displayGPAs1() {
        System.out.printf("GPAs:%n");
        for (int i = 0; i < gpas.size(); i++) {
            System.out.printf("%f ", gpas.get(i));
        }
    }
    public void displayGPAs2() {
        System.out.printf("GPAs (Enhanced):%n");
        for (double gpa: gpas) {
            System.out.printf("%f ", gpa);
        }
    }

    // -=-=- -=-=- -=-=- -=-=-

    // -=-=- Names -=-=-
    // Mutators
    public void addName(String name) {
        names.add(name);
    }

    public void removeName(String name) {
        names.remove(name);
    }

    // Accessors
    public String getName(int index) {
        return names.get(index);
    }

    public int getSizeOfNameList() {
        return names.size();
    }

    // Display Methods
    public void displayNames1() {
        System.out.printf("Names:%n");
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s ", names.get(i));
        }
    }
    public void displayNames2() {
        System.out.printf("Names (Enhanced):%n");
        for (String name: names) {
            System.out.printf("%s ", name);
        }
    }

    // -=-=- -=-=- -=-=- -=-=-
}