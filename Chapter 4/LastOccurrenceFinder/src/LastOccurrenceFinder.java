import java.util.Scanner;

public class LastOccurrenceFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a String value
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();

        // Prompt the user for a character value
        System.out.print("Enter a character: ");
        char searchChar = scanner.next().charAt(0);

        // Find the last occurrence of the character
        int lastIndex = findLastOccurrence(inputString, searchChar);

        // Display the result
        if (lastIndex != -1) {
            System.out.println("Last occurrence of character '" + searchChar + "' in \"" + inputString + "\" is at index " + lastIndex);
        } else {
            System.out.println("Character '" + searchChar + "' not found in \"" + inputString + "\"");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the last occurrence of a character in a String
    private static int findLastOccurrence(String str, char ch) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1; // Character not found
    }
}
