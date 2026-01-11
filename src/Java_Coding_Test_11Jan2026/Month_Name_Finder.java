package Java_Coding_Test_11Jan2026;

// Write a Java program to print the month name based on the month number (1–12) using a switch statement.

import java.util.Scanner;

public class Month_Name_Finder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        int month_number = sc.nextInt();

        String month_name = switch (month_number) {
            case 1 -> "The month name is January";
            case 2 -> "The month name is February";
            case 3 -> "The month name is March";
            case 4 -> "The month name is April";
            case 5 -> "The month name is May";
            case 6 -> "The month name is June";
            case 7 -> "The month name is July";
            case 8 -> "The month name is August";
            case 9 -> "The month name is September";
            case 10 -> "The month name is October";
            case 11 -> "The month name is November";
            case 12 -> "The month name is December";
            default -> "Invalid input!!";
        };
        System.out.println(month_name);
    }
}
