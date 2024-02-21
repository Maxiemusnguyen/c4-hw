import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the provided number is a prime number
        boolean isPrime = isPrimeNumber(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        // Close
        scanner.close();
    }

    // Function to check if a number is a prime number
    private static boolean isPrimeNumber(int num) {
        // Numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }

        // Check divisibility from 2 to 14
        for (int i = 2; i <= 14; i++) {
            if (num != i && num % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }

        return true;
    }
}
