package org.example;
abstract class Vehicle {
    public abstract void printVehicle();
}
class TwoWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("two wheeler");
    }
}
class FourWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("four wheeler");
    }
}
interface VehicleFactory {
    Vehicle createVehicle();
}
class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
class Client {
    private Vehicle vehicle;
    public Client(VehicleFactory factory) {
        this.vehicle = factory.createVehicle();
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
public class FactoryMethod {
    public static void run() {
        System.out.println("Factory Method");

        VehicleFactory twoFactory = new TwoWheelerFactory();
        Client client1 = new Client(twoFactory);
        client1.getVehicle().printVehicle();

        VehicleFactory fourFactory = new FourWheelerFactory();
        Client client2 = new Client(fourFactory);
        client2.getVehicle().printVehicle();
    }
}
