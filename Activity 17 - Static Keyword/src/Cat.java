public class Cat {
    // Instance Variables / Fields / Attributes
    private String name;
    private int age;
    private String breed;

    // Static/Class Variable
    static private int instanceCount = 0;

    public Cat() {
        name = "Calvin";
        age = 5;
        breed = "Orange Tabby";

        instanceCount++;
    }

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
