import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a String value
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        // Reverse the String
        String reversed = reverseString(input);

        // Display the reversed String
        System.out.println("Reverse of \"" + input + "\" is \"" + reversed + "\"");

        // Check if the original String and its reverse are equal
        if (input.equals(reversed)) {
            System.out.println("String value \"" + input + "\" and its reverse \"" + reversed + "\" are equal");
        } else {
            System.out.println("String value \"" + input + "\" and its reverse \"" + reversed + "\" are not equal");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to reverse a String
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
