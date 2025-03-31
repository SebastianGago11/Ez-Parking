public abstract class Vehicle {
    protected String id;
    
    public Vehicle(String id) {
        this.id = id;
    }
    
    public abstract void displayInfo();
}
public class Motorcycle extends Vehicle {
    public Motorcycle(String id) {
        super(id);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle (ID: " + id + ") parked in a compact space.");
    }
}
public class Car extends Vehicle {
    public Car(String id) {
        super(id);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Car (ID: " + id + ") parked in a compact or large space.");
    }
}
public class Bus extends Vehicle {
    public Bus(String id) {
        super(id);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Bus (ID: " + id + ") parked in 5 consecutive large spaces.");
    }
}
public class ParkingManagementSystem {
    public static void main(String[] args) {
        // Create an array to simulate the parking lot
        Vehicle[] parkingLot = new Vehicle[3];
        parkingLot[0] = new Motorcycle("M001");
        parkingLot[1] = new Car("C001");
        parkingLot[2] = new Bus("B001");
        
        System.out.println("Vehicle Parking Management System");
        System.out.println("-----------------------------------");
        
        // Display information for each vehicle
        for (Vehicle vehicle : parkingLot) {
            vehicle.displayInfo();
        }
    }
}
