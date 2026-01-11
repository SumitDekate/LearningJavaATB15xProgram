package Java_Coding_Test_11Jan2026;

//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

import java.util.Scanner;

public class Number {
    static void main() {
        // Enter a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num > 0 ? "Number is positive"
                : num < 0 ? "Number is negative"
                : "Number is zero");
    }
}
