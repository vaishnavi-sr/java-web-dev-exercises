package technology;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    Computer computer;
    @Before
    public void createComputerObject(){
        computer = new Computer(300,800,true);
    }


    @Test
   public void getRam(){
        Computer computer = new Computer(300,800,true);
        assertEquals(300,computer.getRam());

    }

    @Test
    public void checkKeyboard() {
        Computer computer = new Computer(300,800,true);
        assertTrue(computer.isHasKeyboard());

    }

    @Test
    void increaseStorage() {
        Computer computer = new Computer(300,800,true);
        computer.increaseStorage(1000);
        assertEquals(1800,computer.getStorage());
    }
}