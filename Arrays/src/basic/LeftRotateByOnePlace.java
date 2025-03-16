package basic;

import java.util.Arrays;

public class LeftRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LeftRotateByOnePlace lrbop = new LeftRotateByOnePlace();
        lrbop.rotateArrayByOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void rotateArrayByOne(int[] arr) {
        int firstEl = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstEl;
    }
}
