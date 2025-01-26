package basic_array;

import java.util.Arrays;

public class CountOddNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(new CountOddNumbersInArray().countOdd(arr, 5));
    }

    public int countOdd(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }

        return (int) Arrays.stream(arr).filter(num -> num % 2 != 0).count();
    }
}
