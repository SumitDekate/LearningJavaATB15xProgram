package ex_03_Java_Conditions;

/**
 * FizzBuzz Test:
 * ------------------------------------------------------
 * Write a program that prints numbers from 1 to 100.
 * However, for multiples of 3, print "Fizz" instead of the number,and for multiples of 5, print "Buzz."
 * For numbers that are multiples of both 3 and 5, print "FizzBuzz."
 */
public class Lab_FizzBuzz_Test {
    static void main() {
        for (int i = 1; i <= 100 ; i++) {
//          Checks for multiples of 3
            if (i % 3 == 0){
//              Checks for multiples of both 3 and 5
                if (i % 5 == 0)
                    System.out.println("FizzBuzz"); // prints FizzBuzz if multiples of both 3 and 5
                else
                    System.out.println("Fizz"); // prints Fizz if multiple of 3 only
            }
//          Checks for multiples of 5 only and prints Buzz
            else if (i % 5 == 0)
                System.out.println("Buzz");
//          prints the number for non-multiples of 3 and 5
            else
                System.out.println(i);
        }
    }
}
