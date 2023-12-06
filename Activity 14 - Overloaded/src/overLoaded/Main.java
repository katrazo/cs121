package overLoaded;

// This class has a Main method that instantiates [] with each of the three constructors.
public class Main {
    public static void main(String[] args) {
        Shape square = new Shape(); // Default constructor; makes a square
        Shape myShape = new Shape(5); // 1-parameter constructor; Makes a "polygon" type shape with 5 sides
        Shape megaDecagon = new Shape (10,5,"decagon","blue"); // 4-parameter constructor

        System.out.printf("Before change:\t\t\t[%d] sides\t\t|\t\ttype [%s]\n",myShape.getSides(),myShape.getType());

        myShape.modifyShape(4); // changes it to a quadrilateral
        System.out.printf("After 1st change:\t\t[%d] sides\t\t|\t\ttype [%s]\n",myShape.getSides(),myShape.getType());

        myShape.modifyShape(9,"nonogon"); // changes it to a shape with 9 sides called "nonogon"
        System.out.printf("After 2nd change:\t\t[%d] sides\t\t|\t\ttype [%s]\n",myShape.getSides(),myShape.getType());

        System.exit(0);
    }
}
