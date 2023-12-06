package JSON;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSONArrayReader {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void readJson() {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("employees.json"));

            // Get the type of the ArrayList
            Type employeeListType = new TypeToken<ArrayList<Employee>>(){}.getType();

            // Creates an instance of the type (Employee) and adds it to the ArrayList
            employeeList = gson.fromJson(reader, employeeListType);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getInfo());
        }
    }
}
