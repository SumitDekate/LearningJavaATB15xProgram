package Java_Coding_Test_11Jan2026;

// Write a Java program to print all even numbers between 1 and 50 using a do-while loop.

public class Even_num_do_while {
    static void main() {
        int num = 1;
        do {
            if (num % 2 == 0)
                System.out.println(num);
            num++;
        } while (num <= 50);
    }
}
