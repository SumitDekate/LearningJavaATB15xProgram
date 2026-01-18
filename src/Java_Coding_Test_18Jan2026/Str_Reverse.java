package Java_Coding_Test_18Jan2026;

import java.util.Scanner;

public class Str_Reverse {
    static void main() {
        System.out.println("Enter a string to be reversed:");
        String inputStr = new Scanner(System.in).nextLine();
        StringBuilder revStr = new StringBuilder();

        for (int i = inputStr.length()-1; i >= 0; i--)
            revStr.append(inputStr.charAt(i));

        System.out.println("The reversed string is: \""+revStr+"\"");
    }
}
