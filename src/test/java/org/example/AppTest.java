package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;


import org.hamcrest.collection.IsMapContaining;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private List<Integer> actual;
    private List<Integer> expected;
    private int randomNumber;
    private List<Car> carList;

    @Before
    public void setup() throws Exception
    {
        actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        expected = actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        carList = Arrays.asList(
                new Car("Toyota", "Hilux"),
                new Car("BMW", "7 Series"),
                new Car("Lexus", "LFA"),
                new Car("Hyuandai", "Accent"),
                new Car("Chevorlette", "Blaze")
        );
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // List Test: Test List Equality
    @Test
    public void listEqualTest()
    {
        assertThat(actual, is(expected));
        System.out.println("Actual: " + actual + "\n" + "Expected: " + expected);
    }

    // Collection Test: Check Value(s) in collection
    @Test
    public void testCollection()
    {
        assertThat(carList, containsInAnyOrder(carList.toArray()));
        System.out.println("\nCar Object Collection: " + carList.toString());
    }

    // Set Test: Change actual List to random numbers and set list
    @Test
    public void setTest()
    {
        Random random = new Random();

        for (int i = 0; i < actual.size(); i++) {
            randomNumber = random.nextInt(101);
            actual.set(i, randomNumber);
        }
        System.out.println("Random Numbers set:" + actual);
    }

    // Map Test:    Convert List to Map
    //              Add extra Car
    //              Test Contents and Print
    @Test
    public void mapTest()
    {
        Map<String, String> carListMap = carList.stream().collect(
                Collectors.toMap(Car::getMake, Car::getModel));
        carListMap.put("Volwagen", "Beetle");
        assertTrue(carListMap.containsKey("BMW"));
        assertThat(carListMap, IsMapContaining.hasEntry("BMW", "7 Series"));
        System.out.println("\nCar List Map: " + carListMap);
    }

    public class Car
    {
        private String make;
        private String model;

        public Car(String make, String model)
        {
            this.make = make;
            this.model = model;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }
    }
}
