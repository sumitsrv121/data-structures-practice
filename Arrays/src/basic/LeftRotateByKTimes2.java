package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotateByKTimes2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;

        LeftRotateByKTimes2 leftRotateByKTimes = new LeftRotateByKTimes2();
        leftRotateByKTimes.rotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[arr.length - k + i] = temp.get(i);
        }

    }
}
