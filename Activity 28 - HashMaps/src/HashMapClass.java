import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    // Key: Fruit
    // Value: Primary Color of said fruit
    private Map<String, String> fruitMap = new HashMap<>();

    public void addToFruitsList(String fruit, String color) {
        fruitMap.put(fruit, color);
    }

    public void removeFromFruitsList(String fruit) {
        fruitMap.remove(fruit);
    }

    public String getColorOfFruit(String fruit) {
        return fruitMap.get(fruit);
    }

    public void displayFruits() {
        System.out.printf("%-10s | %-10s%n", "Fruits", "Colors");
        System.out.println("-----------------------");
        fruitMap.forEach( (fruit, color) -> {
            System.out.printf("%-10s | %-10s%n", fruit, color);
        });
    }
}
