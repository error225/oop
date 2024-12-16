class Car {
    public void allocateAccessories() {
    }

    public void finalMakeup() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

class Hatchback extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating Hatchback accessories...");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing Hatchback makeup...");
    }
}

class Sedan extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating Sedan accessories...");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing Sedan makeup...");
    }
}

class SUV extends Car {
    @Override
    public void allocateAccessories() {
        System.out.println("Allocating SUV accessories...");
    }

    @Override
    public void finalMakeup() {
        System.out.println("Finalizing SUV makeup...");
    }
}

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

public class TestFactoryPattern {
    public static void main(String[] args) {


        Car hatchback = CarFactory.createCar("hatchback");
        hatchback.allocateAccessories();
        hatchback.finalMakeup();

        Car sedan = CarFactory.createCar("sedan");
        sedan.allocateAccessories();
        sedan.finalMakeup();

        Car suv = CarFactory.createCar("suv");
        suv.allocateAccessories();
        suv.finalMakeup();
    }
}
