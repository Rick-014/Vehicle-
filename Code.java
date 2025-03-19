
class Vehicle {
    protected String brand;
    protected int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void accelerate(int increase) {
        speed += increase;
    }
    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0;
        }
    }
    public void showDetails() {
        System.out.println("Vehicle brand: " + brand + ", Speed: " + speed);
    }
}
class Car extends Vehicle {
    private int fuelLevel; 
    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }
    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
    }
    @Override
    public void showDetails() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");
    }
}
class Bike extends Vehicle {
    private boolean helmetOn;
    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }
    public void wearHelmet() {
        helmetOn = true;
    }
    @Override
    public void showDetails() {
        System.out.println("Bike brand: " + brand + ", Speed: " + speed + ", Helmet On: " + helmetOn);
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 60, 50);
        Bike bike = new Bike("Yamaha", 40, false);
        car.accelerate(20);
        car.brake(30);
        car.refuel(30);
        car.showDetails();
        bike.accelerate(15);
        bike.brake(10);
        bike.wearHelmet();
        bike.showDetails();
    }
}
