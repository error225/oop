import java.util.Scanner;
abstract class Car {
    public void buildChassis() {
        System.out.println("Building chassis...");
    }

    public void assembleParts() {
        System.out.println("Assembling parts...");
    }

    public abstract void allocateAccessories(); // Abstract step

    public abstract void finalMakeup(); // Abstract step

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

// Hatchback class
class Hatchback extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating Hatchback-specific accessories...");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing Hatchback-specific makeup...");
    }
}

// Sedan class
class Sedan extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating Sedan-specific accessories...");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing Sedan-specific makeup...");
    }
}

// SUV class
class SUV extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating SUV-specific accessories...");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing SUV-specific makeup...");
    }
}

// Factory class to create Car objects
class CarFactory {
    public static Car createCar(String carType) {
        switch (carType.toLowerCase()) {
            case "hatchback":
                return new Hatchback();
            case "sedan":
                return new Sedan();
            case "suv":
                return new SUV();
            default:
                throw new IllegalArgumentException("Unknown car type: " + carType);
        }
    }
}

// Main Test Factory Pattern class
public class TestFactoryPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCar Manufacturing System:");
            System.out.println("1. Create Hatchback");
            System.out.println("2. Create Sedan");
            System.out.println("3. Create SUV");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manufactureCar("hatchback");
                    break;
                case 2:
                    manufactureCar("sedan");
                    break;
                case 3:
                    manufactureCar("suv");
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Method to manufacture a car
    private static void manufactureCar(String carType) {
        Car car = CarFactory.createCar(carType); // Use factory to create car
        System.out.println("\nManufacturing a " + car + "...");
        car.buildChassis();
        car.assembleParts();
        car.allocateAccessories();
        car.finalMakeup();
        System.out.println(car + " manufacturing process complete!");
    }
}
