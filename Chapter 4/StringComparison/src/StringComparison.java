import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two String values
        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();

        // Compare lengths
        if (str1.length() > str2.length()) {
            System.out.println("String \"" + str1 + "\" is longer than String \"" + str2 + "\"");
        } else if (str1.length() < str2.length()) {
            System.out.println("String \"" + str2 + "\" is longer than String \"" + str1 + "\"");
        } else {
            System.out.println("Both strings have the same length.");
        }

        // Compare
        int order = str1.compareTo(str2);
        if (order < 0) {
            System.out.println("String \"" + str1 + "\" appears before String \"" + str2 + "\" in lexicographic order");
        } else if (order > 0) {
            System.out.println("String \"" + str2 + "\" appears before String \"" + str1 + "\" in lexicographic order");
        } else {
            System.out.println("Both strings are the same in lexicographic order.");
        }

        // Create a new sentence by combining both strings
        String newSentence = str1 + " " + str2;
        System.out.println("New sentence created is \"" + newSentence + "\"");

        // Close
        scanner.close();
    }
}
