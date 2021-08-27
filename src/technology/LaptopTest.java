package technology;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {
    Laptop laptop;

    @BeforeEach
    void setUp() {
        laptop = new Laptop(300,600,true,4);
    }
}