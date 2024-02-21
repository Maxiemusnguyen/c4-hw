import java.util.Scanner;

public class AverageGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables for grade input and calculation
        int sum = 0;
        int count = 0;

        // Prompt the user for student grades
        System.out.println("Enter student grades (enter a character to stop):");
        while (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            sum += grade;
            count++;
        }

        // Calculate the average grade
        double average = (count > 0) ? (double) sum / count : 0.0;

        // Display the result
        System.out.println("Average student grade is " + average);

        // Close the scanner
        scanner.close();
    }
}
