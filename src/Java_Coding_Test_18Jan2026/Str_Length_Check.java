package Java_Coding_Test_18Jan2026;

import java.util.Scanner;

public class Str_Length_Check {
    static void main() {
        System.out.println("Enter a string to check length:");
        String input_str = new Scanner(System.in).nextLine();

        if (input_str.length() > 10)
            System.out.println("Length of given string is "+input_str.length()+", which is greater than 10.");
        else
            System.out.println("Length of given string is "+input_str.length()+", which is not greater than 10.");
    }
}
