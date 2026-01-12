package Java_Coding_Test_11Jan2026;

// Write a Java program to reverse a given number using a do-while loop.

import java.util.Scanner;

public class Reverse_number_do_while {
    static void main() {
        //Prompts user to enter a number to be reversed
        System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt();
        int reversed_num = 0, temp = num;
        do {
            reversed_num = reversed_num * 10 + temp % 10;
            temp /= 10;
        } while (temp > 0);
        System.out.printf("The reverse of %d is %d", num, reversed_num);
    }
}
