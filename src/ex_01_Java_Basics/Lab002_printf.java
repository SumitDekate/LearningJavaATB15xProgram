package ex_01_Java_Basics;

public class Lab002_printf {
    static void main() {
        int table_of = 9;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", table_of, i, table_of*i);
        }
    }
}
