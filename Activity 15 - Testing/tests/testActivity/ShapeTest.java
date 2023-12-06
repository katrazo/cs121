package testActivity;

// libraries for JUnit5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    private Shape shapeTest = new Shape();
    /* Shape shapeTest
     * sides = 4;
     * size = 1;
     * type = "square";
     * color = "red";
     */

    // Fails
    /* @Test
    void getSides() {
        assertEquals(3, shapeTest.getSides());
    } */

    // Fails
    /* @Test
    void getType() {
        assertEquals("rectangle", shapeTest.getType());
    } */

    // Passes
    @Test
    void getSides() {
        assertEquals(4, shapeTest.getSides());
    }

    // Passes
    @Test
    void getType() {
        assertEquals("square", shapeTest.getType());
    }
}