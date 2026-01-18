package Java_Coding_Test_18Jan2026;

import java.util.Scanner;

public class Str_Uppercase {
    static void main() {
        System.out.println("Enter a string:");
        String lower_str = new Scanner(System.in).nextLine();

        System.out.println("Given string in Uppercase looks like \""+lower_str.toUpperCase()+"\"");
    }
}
