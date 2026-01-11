package Java_Coding_Test_11Jan2026;

// Write a Java program to check whether a given number is even or odd using arithmetic operators.

import java.util.Scanner;

public class Even_Odd_Number {
    static void main() {
        //Prompt the user to enter a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //If the number is divisible by 2, then even, else odd
        if (num % 2 == 0)
            System.out.printf("%d is Even", num);
        else
            System.out.printf("%d is Odd", num);

        sc.close();
    }
}
