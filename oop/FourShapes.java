import java.util.Scanner;

abstract class Shape {
    public double dimension1;
    public double dimension2;

    public void inputData(double d1, double d2) {
        this.dimension1 = d1;
        this.dimension2 = d2;
    }

    public abstract double computeArea();
}

class Triangle extends Shape {
    @Override
    public double computeArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

class Rectangle extends Shape {
    @Override
    public double computeArea() {
        return dimension1 * dimension2;
    }
}

public class FourShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Shape shape;

        System.out.println("Enter base and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        shape = new Triangle();
        shape.inputData(base, height);
        System.out.println("Area of Triangle: " + shape.computeArea());

        System.out.println("Enter length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        shape = new Rectangle();
        shape.inputData(length, breadth);
        System.out.println("Area of Rectangle: " + shape.computeArea());

        sc.close();
    }
}
