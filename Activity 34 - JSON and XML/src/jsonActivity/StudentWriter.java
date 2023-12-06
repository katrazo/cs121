package jsonActivity;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student student = new Student("John Doe",1234,3.01);

            Gson gson = new Gson();

            // convert Java object to json
            String jsonString = gson.toJson(student);

            // Write Json string to file
            FileWriter fileWriter = new FileWriter("src/jsonActivity/students.json");
            fileWriter.write(jsonString);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
