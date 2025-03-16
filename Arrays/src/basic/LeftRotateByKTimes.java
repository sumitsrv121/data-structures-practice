package basic;

import java.util.Arrays;

public class LeftRotateByKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 2;

        LeftRotateByKTimes leftRotateByKTimes = new LeftRotateByKTimes();
        leftRotateByKTimes.rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public void rotateArray(int[] arr, int k) {
        k = k % arr.length;

        rotate(arr, 0, k - 1);
        rotate(arr, k, arr.length - 1);
        rotate(arr, 0, arr.length - 1);
    }

    private void rotate(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
