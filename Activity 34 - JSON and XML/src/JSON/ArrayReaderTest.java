package JSON;

public class ArrayReaderTest {
    public static void main(String[] args) {
        JSONArrayReader reader = new JSONArrayReader();
        reader.readJson();
        reader.printEmployeeList();
    }
}
