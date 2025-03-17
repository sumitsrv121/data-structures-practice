package LogicBuilding;

import java.util.Arrays;

public class MovesZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};

        MovesZeroesToEnd movesZeroesToEnd = new MovesZeroesToEnd();
        movesZeroesToEnd.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void moveZeroes(int[] arr) {
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[start++] = arr[i];
            }
        }

        while (start < arr.length) {
            arr[start++] = 0;
        }

    }


}
