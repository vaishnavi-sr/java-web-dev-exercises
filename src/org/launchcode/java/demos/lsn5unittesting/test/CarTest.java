package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    Car test_Car;

    @Before
    public void createCarObject() {
        test_Car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10,0.001);
    }
    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank() {

        assertEquals(10, test_Car.getGasTankLevel(), .001);
//        assertTrue("Condition Fails when not equal to 10", test_car.getGasTankLevel()==10);
//        assertFalse("Condition fails when it is equal to 0",test_car.getGasTankLevel()==0);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testTankAfterDriving(){
        test_Car.drive(50);
        assertEquals(9, test_Car.getGasTankLevel(),0.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void  testGasTankAfterExceedingTankRange(){
        test_Car.drive(501);
        assertEquals(0, test_Car.getGasTankLevel(),0.001);

    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
      test_Car.addGas(5);

        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
    //TODO:  check gas tank size is not null
    @Test
    public void gasTankSizeNotNull(){
        test_Car.getGasTankSize();
        assertNotNull(test_Car.getGasTankSize());
    }
    //TODO: setiing gas tank size
    @Test
    public void settingGasTankSize(){
        test_Car.setGasTankSize(20);
        assertEquals(20,test_Car.getGasTankSize());
    }
    //TODO: changing model
    @Test
    public void changingModelName(){
        test_Car.setModel("Camry");
        assertEquals("Camry",test_Car.getModel());
    }
    //TODO: a different make
    @Test
    public void ChangingMake(){
        test_Car.setMake("Honda");
        assertEquals("Honda",test_Car.getMake());
    }
    //TODO: setting miles per gallon
    @Test
    public void changeMilesPerGallon(){
        test_Car.setMilesPerGallon(60);
        assertEquals(60,test_Car.getMilesPerGallon(),0.001);
    }
    //TODO: setting gas Tank size
    @Test
    public void moreGasTankSize(){
        test_Car.setGasTankSize(25);
        assertEquals(25,test_Car.getGasTankSize());
    }
    //TODO: confirm gas Tank level equals gas tank size
    @Test
    public void sameSizeAndLevel(){
        test_Car.setGasTankSize(10);
        assertEquals(10,test_Car.getGasTankLevel(),0.001);
    }
}
