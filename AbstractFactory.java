package org.example;
interface Car {
    void printCar();
}
interface Truck {
    void printTruck();
}
class GasCar implements Car {
    @Override
    public void printCar() {
        System.out.println("Gas_Car");
    }
}
class GasTruck implements Truck {
    @Override
    public void printTruck() {
        System.out.println("Gas_Truck");
    }
}
class ElectricCar implements Car {
    @Override
    public void printCar() {
        System.out.println("Electric_Car");
    }
}
class ElectricTruck implements Truck {
    @Override
    public void printTruck() {
        System.out.println("Electric_Truck");
    }
}
interface VehicleFactoryAF {
    Car createCar();
    Truck createTruck();
}
class GasVehicleFactory implements VehicleFactoryAF {
    @Override
    public Car createCar() {
        return new GasCar();
    }
    @Override
    public Truck createTruck() {
        return new GasTruck();
    }
}
class ElectricVehicleFactory implements VehicleFactoryAF {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }
    @Override
    public Truck createTruck() {
        return new ElectricTruck();
    }
}
public class AbstractFactory {
    public static void run() {
        System.out.println("\nAbstract Factory");

        VehicleFactoryAF gasFactory = new GasVehicleFactory();
        gasFactory.createCar().printCar();
        gasFactory.createTruck().printTruck();

        VehicleFactoryAF electricFactory = new ElectricVehicleFactory();
        electricFactory.createCar().printCar();
        electricFactory.createTruck().printTruck();
    }
}
