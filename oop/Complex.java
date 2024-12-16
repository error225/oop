import java.util.Scanner;

public class Complex {
    public double real;
    public double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return String.format("%.2f %s %.2fi", real, (imaginary >= 0 ? "+" : ""), imaginary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginary part of first complex number:");
        Complex c1 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Enter real and imaginary part of second complex number:");
        Complex c2 = new Complex(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("\nFirst Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);

        System.out.println("\nAddition: " + c1.add(c2));
        System.out.println("Subtraction: " + c1.subtract(c2));
        System.out.println("Multiplication: " + c1.multiply(c2));
        System.out.println("Division: " + c1.divide(c2));

        scanner.close();
    }
}
