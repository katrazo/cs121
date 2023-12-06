package activity20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayListTest {
    // This was a little awkward because I had to use methods not tested until later in order to correctly use the assertEquals() method.
    // Or was I just supposed to run them and prove they work instead of actually making a JUnit5 test...?
    StringArrayList testArray = new StringArrayList();

    @BeforeEach
    void setup() {
        testArray.addString("Bob");
    }

    @Test
    void addString() {
        testArray.addString("Jamie");
        assertEquals("Jamie", testArray.getStringAtIndex(1));
    }

    @Test
    void removeString() {
        testArray.addString("Jamie");
        testArray.removeString("Bob");
        assertEquals("Jamie", testArray.getStringAtIndex(0));
    }

    @Test
    void getSize() {
        testArray.addString("Jamie");
        assertEquals(2,testArray.getSize());
    }

    @Test
    void getStringAtIndex() {
        assertEquals("Bob", testArray.getStringAtIndex(0));
    }

    @Test
    void displayFor() {
        testArray.addString("Jamie");
        testArray.addString("Madeleine");
        System.out.println("Regular for loop:");
        testArray.displayFor();
        System.out.println();
    }

    @Test
    void displayForEach() {
        testArray.addString("Jamie");
        testArray.addString("Madeleine");
        System.out.println("Enhanced foreach loop:");
        testArray.displayForEach();
        System.out.println();
    }
}