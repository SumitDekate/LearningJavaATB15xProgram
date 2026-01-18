package Java_Coding_Test_18Jan2026;

// Write a Java program to count the total number of characters in a given string (excluding spaces).

import java.util.Scanner;

public class String_Character_Count {
    static void main() {
        System.out.println("Enter a string to count characters: ");
        String input_string = new Scanner(System.in).nextLine();
        
        int char_count = 0;
        for (int i = 0; i < input_string.length(); i++) {
            if (input_string.charAt(i) != ' ')
                char_count++;
        }
        System.out.println("The given string has a character count (without spaces) of "+char_count);
    }
}
