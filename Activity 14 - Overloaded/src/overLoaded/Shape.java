package overLoaded;

// This class contains 3 overloaded constructors and an overloaded method to be instantiated/used in the Main.main() method
public class Shape {
    private int sides; // How many sides the shape has
    private int size; // The relative size of a shape
    private String type; // The type of shape (ex. "square","circle",etc.)
    private String color; // The color of the shape as a string (ex. "red", "mahogany", "blue",etc.)

    // Default constructor; no parameters
    public Shape() {
        sides = 4;
        size = 1;
        type = "square";
        color = "red";
    }

    // Overloaded constructor; 1 parameter
    public Shape(int sides) {
        this.sides = sides;
        size = 1;
        if (sides < 3)
            type = "irregular shape";
        else if (sides == 3)
            type = "triangle";
        else if (sides == 4)
            type = "quadrilateral";
        else
            type = "polygon";
        color = "red";
    }

    // Overloaded constructor; all (4) parameters
    public Shape(int sides, int size, String type, String color) {
        this.sides = sides;
        this.size = size;
        this.type = type;
        this.color = color;
    }

    // Initial method; 1 parameter
    public void modifyShape(int sides) {
        this.sides = sides;
        if (sides < 3)
            type = "irregular shape";
        else if (sides == 3)
            type = "triangle";
        else if (sides == 4)
            type = "quadrilateral";
        else
            type = "polygon";
    }

    // Overloaded method; 2 parameters
    public void modifyShape(int sides, String type) {
        this.sides = sides;
        this.type = type;
    }

    // Getters to fetch changed values
    public int getSides() {
        return sides;
    }
    public String getType() {
        return type;
    }
}
