package Java_Coding_Test_11Jan2026;

// Write a Java program to find the maximum of two numbers using the ternary operator.

import java.util.Scanner;

public class Max_of_two {
    static void main() {
        //Prompts user to enter two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("The maximum of %d and %d: %d", num1, num2, (num1 > num2)?num1:num2);

        sc.close();
    }
}
