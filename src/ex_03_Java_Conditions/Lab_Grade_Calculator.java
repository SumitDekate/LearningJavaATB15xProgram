package ex_03_Java_Conditions;

import java.util.Scanner;
/**
 * Grade Calculator:
 * ----------------------------------------------------
 * Write a program that calculates and displays the letter grade for a given numerical score
 * (e.g., A, B, C, D, or F) based on the following grading scale:
 * A: 90-100    B: 80-89    C: 70-79    D: 60-69    F: 0-59
 */
public class Lab_Grade_Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score between 0 to 100:");
        int score = sc.nextInt();

        if (score >=90 && score <= 100)
            System.out.printf("Grade %c", 'A');
        else if (score >=80 && score < 90)
            System.out.printf("Grade %c", 'B');
        else if (score >=70 && score < 80)
            System.out.printf("Grade %c", 'C');
        else if (score >=60 && score < 70)
            System.out.printf("Grade %c", 'D');
        else if (score >=0 && score < 60)
            System.out.printf("Grade %c", 'F');
        else
            System.out.println("Invalid score value");
    }
}
