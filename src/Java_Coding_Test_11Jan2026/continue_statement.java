package Java_Coding_Test_11Jan2026;

// Write a Java program to print numbers from 1 to 10,
// but skip printing the number 5 using the continue statement.

public class continue_statement {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
