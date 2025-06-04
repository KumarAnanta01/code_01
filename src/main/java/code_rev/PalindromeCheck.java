package code_rev;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase (optional for string inputs)
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = new StringBuilder(cleanInput).reverse().toString();

        if (cleanInput.equals(reversed)) {
            System.out.println("✅ '" + input + "' this is a palindrome.");
        } else {
            System.out.println("❌ '" + input + "'this is not a palindrome.");
        }

        scanner.close();
    }
}
