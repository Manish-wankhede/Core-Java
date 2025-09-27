class Vehicle{
    void run(){
        System.out.println("Vehicle is Run");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike id run");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("Car is run");
    }
}

class Truck extends Vehicle{
    void run(){
        System.out.println("Truck is run");
    }
}

public class Task{
    public static void main(String[] args) {
        Vehicle v1[] = new Vehicle[3];
        v1[0] = new Bike();
        v1[1] = new Car();
        v1[2] = new Truck();

        for (Vehicle vehicle : v1) {
            vehicle.run();
        }
    }
}