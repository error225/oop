import java.util.*;

public class FiveGenericProgram {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int original = number, reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }

    public static <T> int countByProperty(Collection<T> collection, java.util.function.Predicate<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (type 'done' to finish):");
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }

        System.out.println("Collection: " + numbers);

        System.out.println("Count of even numbers: " + countByProperty(numbers, FiveGenericProgram::isEven));
        System.out.println("Count of odd numbers: " + countByProperty(numbers, FiveGenericProgram::isOdd));
        System.out.println("Count of prime numbers: " + countByProperty(numbers, FiveGenericProgram::isPrime));
        System.out.println("Count of palindromes: " + countByProperty(numbers, FiveGenericProgram::isPalindrome));

        sc.close();
    }
}
