import java.util.Scanner;

interface Vehicle {
    void gearChange(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle {
    public int speed;
    public int gear;

    @Override
    public void gearChange(int newGear) {
        gear = newGear;
        System.out.println("Bicycle gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed);
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bicycle speed decreased to: " + speed);
    }
}

class Bike implements Vehicle {
    public int speed;
    public int gear;

    @Override
    public void gearChange(int newGear) {
        gear = newGear;
        System.out.println("Bike gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to: " + speed);
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bike speed decreased to: " + speed);
    }
}

class Car implements Vehicle {
    public int speed;
    public int gear;

    @Override
    public void gearChange(int newGear) {
        gear = newGear;
        System.out.println("Car gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed increased to: " + speed);
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Car speed decreased to: " + speed);
    }
}

public class ThreeInterfaceForVehicle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // Bicycle operations
        Bicycle bicycle = new Bicycle();
        System.out.println("\nBicycle Operations:");
        bicycle.gearChange(2);
        bicycle.speedUp(10);
        bicycle.applyBrakes(3);

        // Bike operations
        Bike bike = new Bike();
        System.out.println("\nBike Operations:");
        bike.gearChange(3);
        bike.speedUp(20);
        bike.applyBrakes(5);

        // Car operations
        Car car = new Car();
        System.out.println("\nCar Operations:");
        car.gearChange(5);
        car.speedUp(50);
        car.applyBrakes(10);

        // sc.close();
    }
}


