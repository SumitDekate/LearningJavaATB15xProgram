package Java_Coding_Test_11Jan2026;

// Write a Java program to check whether a given number is even or odd using arithmetic operators.

import java.util.Scanner;

public class Arithmetic_Ops {
    static void main() {
        // Prompt user to enter two integers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        System.out.printf("Sum: %d + %d = %d \n", num1, num2, num1 + num2);
        System.out.printf("Difference: %d - %d = %d \n", num1, num2, num1 - num2);
        System.out.printf("Product: %d x %d = %d \n", num1, num2, num1 * num2);
        System.out.printf("Division: %d / %d = %d \n", num1, num2, num1 / num2);
        System.out.printf("Remainder: %d %% %d = %d", num1, num2, num1 % num2);

        sc.close();
    }
}
