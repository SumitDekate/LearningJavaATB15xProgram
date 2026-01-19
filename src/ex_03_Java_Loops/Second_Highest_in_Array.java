package ex_03_Java_Loops;

public class Second_Highest_in_Array {
    static void main() {
        int[] numbers = {12, 34, 10, 1, 100, 6, 40, 32};
        int Highest = 0, secondHighest = 0;

        for (int num : numbers) {
            if (num > Highest) {
                secondHighest = Highest;
                Highest = num;
            } else if (num > secondHighest && num != Highest) {
                secondHighest = num;
            }
        }
        System.out.println("The second highest number in the array is "+secondHighest);
    }
}
