import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer value
        System.out.print("Enter an integer value: ");
        int n = scanner.nextInt();

        // Calculate and print the factorial
        long factorial = calculateFactorial(n);
        System.out.println(n + "! = " + factorial);

        // Close
        scanner.close();
    }

    // Function to calculate
    private static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
            return -1; // Indicate an error value
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
