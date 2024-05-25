package Oops;

class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
    
    public void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with ignition");
    }
    
    @Override
    public void stop() {
        System.out.println("Car stops by applying brakes");
    }


public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        
        myVehicle.start(); // Output: Vehicle starts
        myVehicle.stop();  // Output: Vehicle stops
        
        myCar.start();     // Output: Car starts with ignition
        myCar.stop();      // Output: Car stops by applying brakes
    }
}
}
