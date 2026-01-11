package Java_Coding_Test_11Jan2026;

// Write a Java program to print numbers from 1 to 10, but stop the loop
// when the number becomes 5 using the break statement.

public class break_statement {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5)
                break;
        }
    }
}
