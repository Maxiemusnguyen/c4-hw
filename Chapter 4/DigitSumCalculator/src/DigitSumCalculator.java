import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateDigitSum(number);

        // Display the result
        System.out.println("Sum of digits of " + number + " is " + sum);

        // Close the scanner
        scanner.close();
    }

    // Function to calculate 
    private static int calculateDigitSum(int num) {
        int sum = 0;

        // Use a loop to extract and add each digit
        while (num != 0) {
            sum += num % 10; // Extract the last digit
            num /= 10;       // Remove the last digit
        }

        return sum;
    }
}
