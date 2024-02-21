import java.util.Scanner;

public class HighLowGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables for grade input and calculation
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        // Prompt the user for student grades
        System.out.println("Enter student grades (enter a character to stop):");
        while (scanner.hasNextInt()) {
            int grade = scanner.nextInt();

            // Update highest and lowest grades
            highest = Math.max(highest, grade);
            lowest = Math.min(lowest, grade);
        }

        // Display the highest and lowest grades
        System.out.println("Highest student grade is " + highest);
        System.out.println("Lowest student grade is " + lowest);

        // Close the scanner
        scanner.close();
    }
}
