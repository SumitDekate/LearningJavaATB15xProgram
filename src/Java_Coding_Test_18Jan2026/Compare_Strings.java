package Java_Coding_Test_18Jan2026;

import java.util.Scanner;

public class Compare_Strings {
    static void main() {
        System.out.print("Enter the first string: ");
        String str1 = new Scanner(System.in).nextLine();

        System.out.print("Enter the second string: ");
        String str2 = new Scanner(System.in).nextLine();

        if (str1.equalsIgnoreCase(str2))
            System.out.println("The two strings are equal.");
        else
            System.out.println("The two strings are not equal.");
    }
}
