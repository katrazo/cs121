package jsonActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("src/jsonActivity/students.json"));

            // Convert json to Java object
            Student student = gson.fromJson(reader, Student.class);

            System.out.println("****Student Details****");
            System.out.printf("Student Name: %s%nStudent id: %d%nStudent GPA: %.2f%n",
                    student.getName(), student.getId(), student.getGpa());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
