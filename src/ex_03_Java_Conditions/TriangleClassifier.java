package ex_03_Java_Conditions;

import java.util.Scanner;

/**
 * Triangle Classifier:
 * -------------------------------------------------------------------------
 * Write a program that classifies a triangle based on its side lengths.
 * Given three input values representing the lengths of the sides,
 * determine if the triangle is equilateral (all sides are equal),
 * isosceles (exactly two sides are equal), or scalene (no sides are equal).
 * Use an if-else statement to classify the triangle.
 */

public class TriangleClassifier {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides below:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("This is an Equilateral triangle");
        else if (a == b || b == c || a == c)
            System.out.println("This is an Isosceles triangle");
        else
            System.out.println("This is a Scalene triangle");
    }
}
