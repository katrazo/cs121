package JSON;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReader {
    public static void main(String[] args) {
        try {
            // create a GSON object
            Gson gson = new Gson();
            /* reading the json file with the BufferedReader class object
             * see <cannot read link because image is too low res>
             * what is buffered? <another link>
             * FileReader class <another link> */

            BufferedReader reader = new BufferedReader(new FileReader("employee.json"));

            // Convert json to Java object
            Employee employee = gson.fromJson(reader, Employee.class);

            System.out.println("****Employee Details****");
            System.out.printf("Employee name: %s\nEmployee id: %d\nEmployee department: %s",
                    employee.getName(), employee.getId(), employee.getDepartment());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
