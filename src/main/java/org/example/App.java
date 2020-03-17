package org.example;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Hilux"));
        carList.add(new Car("BMW", "3 Series"));
        carList.add(new Car("Lexus", "LFA"));

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,1);
        numbers.add(1,2);
        numbers.add(2, 3);
        System.out.println(numbers);
        System.out.println(carList.toString());
    }

    public static class Car
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
