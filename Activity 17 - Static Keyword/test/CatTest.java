import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Cat calvin = new Cat();
        Cat sassy = new Cat("Sassy", 7, "Calico");
    }

    @org.junit.jupiter.api.Test
    void getInstanceCount() {
        assertEquals(2,Cat.getInstanceCount());
    }
}