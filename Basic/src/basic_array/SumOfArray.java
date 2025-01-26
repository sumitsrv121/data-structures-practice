package basic_array;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(new SumOfArray().sum(arr, arr.length));
    }

    public int sum(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        return Arrays.stream(arr).sum();
    }
}
