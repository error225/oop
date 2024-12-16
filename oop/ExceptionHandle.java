import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Num1: ");
            String input1 = scanner.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter Num2: ");
            String input2 = scanner.nextLine();
            int num2 = Integer.parseInt(input2);

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int result = num1 / num2;
            System.out.println("Division result: " + result);
        }
         catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        }
         catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
         catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
