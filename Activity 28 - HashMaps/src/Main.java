public class Main {
    public static void main(String[] args) {
        HashMapClass hashMap = new HashMapClass();

        hashMap.addToFruitsList("Apple", "Red");
        hashMap.addToFruitsList("Orange", "Orange");
        hashMap.addToFruitsList("Pear", "Green");

        hashMap.displayFruits();
        System.out.println();

        hashMap.removeFromFruitsList("Apple");

        hashMap.displayFruits();
    }
}
