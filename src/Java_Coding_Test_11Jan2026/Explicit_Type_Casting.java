package Java_Coding_Test_11Jan2026;

// Write a Java program to convert a double value into an int using explicit type casting and print both values.

import java.util.Scanner;

public class Explicit_Type_Casting {
    static void main() {
        // Prompt user to enter a decimal number
        double num = new Scanner(System.in).nextDouble();

        System.out.println("Explicit type casting of double " + num + " to int is " + (int)num);
    }
}
