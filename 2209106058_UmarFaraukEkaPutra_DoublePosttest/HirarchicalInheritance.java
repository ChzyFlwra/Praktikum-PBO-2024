// Abstract class 2 - Vehicle
abstract class Vehicle {
    final String fuelType = "Petrol"; // Final variable
    
    abstract void drive(); // Abstract method
    
    // Final method
    final void refuel() {
        System.out.println("Refueling with " + fuelType);
    }
}

// Concrete class 2a - Car
class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving");
    }
}

// Concrete class 2b - Bike
class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Bike is driving");
    }
}

