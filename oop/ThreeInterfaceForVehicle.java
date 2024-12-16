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


// public class ThreeInterfaceForVehicle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Vehicle vehicle = null;
//         int choice;

//         do {
//             System.out.println("\nVehicle Operations Menu:");
//             System.out.println("1. Select Bicycle");
//             System.out.println("2. Select Bike");
//             System.out.println("3. Select Car");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     vehicle = new Bicycle();
//                     break;
//                 case 2:
//                     vehicle = new Bike();
//                     break;
//                 case 3:
//                     vehicle = new Car();
//                     break;
//                 case 4:
//                     System.out.println("Exiting the program. Goodbye!");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }

//             if (choice >= 1 && choice <= 3) {
//                 int operation;
//                 do {
//                     System.out.println("\nOperations for " + vehicle.getClass().getSimpleName() + ":");
//                     System.out.println("1. Change Gear");
//                     System.out.println("2. Speed Up");
//                     System.out.println("3. Apply Brakes");
//                     System.out.println("4. Back to Main Menu");
//                     System.out.print("Enter your operation: ");
//                     operation = sc.nextInt();

//                     switch (operation) {
//                         case 1:
//                             System.out.print("Enter new gear: ");
//                             int newGear = sc.nextInt();
//                             vehicle.gearChange(newGear);
//                             break;
//                         case 2:
//                             System.out.print("Enter speed increment: ");
//                             int increment = sc.nextInt();
//                             vehicle.speedUp(increment);
//                             break;
//                         case 3:
//                             System.out.print("Enter speed decrement: ");
//                             int decrement = sc.nextInt();
//                             vehicle.applyBrakes(decrement);
//                             break;
//                         case 4:
//                             System.out.println("Returning to Main Menu.");
//                             break;
//                         default:
//                             System.out.println("Invalid operation. Please try again.");
//                     }
//                 } while (operation != 4);
//             }
//         } while (choice != 4);

//         sc.close();
//     }
// }