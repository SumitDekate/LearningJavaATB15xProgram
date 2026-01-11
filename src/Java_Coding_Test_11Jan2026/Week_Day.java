package Java_Coding_Test_11Jan2026;

// Write a Java program to print the name of the day based on a number (1–7) using a switch statement.

import java.util.Scanner;

public class Week_Day {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the week day: ");
        int day_number = sc.nextInt();

        String day_name = switch (day_number){
            case 1 -> "The day is Monday";
            case 2 -> "The day is Tuesday";
            case 3 -> "The day is Wednesday";
            case 4 -> "The day is Thursday";
            case 5 -> "The day is Friday";
            case 6 -> "The day is Saturday";
            case 7 -> "The day is Sunday";
            default -> "Invalid input!!";
        };
        System.out.println(day_name);
    }
}
