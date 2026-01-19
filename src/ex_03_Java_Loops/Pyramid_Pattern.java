package ex_03_Java_Loops;

import java.util.Scanner;

public class Pyramid_Pattern {
    static void main() {
        System.out.print("Enter the value of n: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
