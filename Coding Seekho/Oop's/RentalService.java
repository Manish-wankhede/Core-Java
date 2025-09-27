abstract class Vehicle {

    public abstract void start();

    public abstract void stop();

    public void fuelStatus() {
        System.out.println("Fuel level is sufficient. ");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car engine started with keyless ignition");
    }

    public void stop() {
        System.out.println("Car has been stop and parked");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike started with kick start.");
    }

    public void stop() {
        System.out.println("Bike engine stop with side stand.");
    }
}

class Truck extends Vehicle {
    public void start() {
        System.out.println("Truck started with diesel ignition system.");
    }

    public void stop() {
        System.out.println("Truck has been stopped using air brakes.");

    }
}

public class RentalService {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();
        vehicle.fuelStatus();
        vehicle.stop();

        System.out.println();

        vehicle = new Bike();
        vehicle.start();
        vehicle.fuelStatus();
        vehicle.stop();

        System.out.println();

        vehicle = new Truck();
        vehicle.start();
        vehicle.fuelStatus();
        vehicle.stop();

        System.out.println();
    }
}
