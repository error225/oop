import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input for Num1 and Num2
            System.out.print("Enter first number (Num1): ");
            String num1Input = scanner.nextLine();
            System.out.print("Enter second number (Num2): ");
            String num2Input = scanner.nextLine();

            // Converting String inputs to integers
            int num1 = Integer.parseInt(num1Input);
            int num2 = Integer.parseInt(num2Input);

            // Perform division and handle possible exceptions
            System.out.println("Division Result: " + (num1 / num2));

            // Simulating an ArrayIndexOutOfBoundsException
            int[] array = new int[2];
            System.out.println(array[3]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
