package code_rev;

import java.util.Scanner;

public class OddEvenNoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // 1 = odd, 0 = even
        int result = num % 2;

        System.out.print(num);
        System.out.print(" is ");
        System.out.print(result == 0 ? 0 : 1); // 0 for even, 1 for odd

        scanner.close();
    }
}

