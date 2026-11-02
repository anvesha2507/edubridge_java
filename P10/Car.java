package P10;
class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle brand: " + brand);
    }
}

public class Car extends Vehicle {

    String brand;

    Car(String vehicleBrand, String carBrand) {
        super(vehicleBrand);
        this.brand = carBrand;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Car brand: " + brand);
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota", "BMW");

        car.display();

        System.out.println("Vehicle brand using super: " + car.getVehicleBrand());
    }

    String getVehicleBrand() {
        return super.brand;
    }
}