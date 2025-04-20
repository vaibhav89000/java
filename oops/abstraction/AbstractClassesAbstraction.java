// Abstraction is one of the four pillars of OOP (Object-Oriented Programming).
// It means hiding internal implementation details and showing only essential features to the user.

// Think of it like driving a car: You only use the steering wheel, brakes, and accelerator, but you don't need to know how the engine or transmission works internally.

// How Abstraction is Achieved in Java?
// Java provides two ways to achieve abstraction:

// Abstract Classes
// Interfaces



abstract class Vehicle {
    // Abstract method – no body
    abstract void startEngine();

    // Concrete method – has a body
    void fuelType() {
        System.out.println("Uses petrol or diesel");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with key");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started with self-start");
    }
}

public class AbstractClassesAbstraction {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();  // Car engine started with key
        myCar.fuelType();     // Uses petrol or diesel

        Vehicle myBike = new Bike();
        myBike.startEngine(); // Bike engine started with self-start
    }
}
