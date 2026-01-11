package Java_Coding_Test_11Jan2026;

// Write a Java program to perform addition, subtraction, multiplication,
// or division based on user choice using a switch statement.

import java.util.Scanner;

public class Simple_Calculator {
    static void main() {
        System.out.println("This is simple calculator");
        // Prompt user to enter two integers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        System.out.print("""
                
                Operations to perform:
                1. Add
                2. Subtract
                3. Multiply
                4. Divide
                
                Select the option:\s""");

        int option_number = sc.nextInt();

        var result = switch (option_number){
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> "Invalid input!";
        };

        System.out.println(result);
    }
}
