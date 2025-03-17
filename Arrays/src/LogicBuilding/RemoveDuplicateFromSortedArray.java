package LogicBuilding;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        int ans = removeDuplicateFromSortedArray.removeDuplicates(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }

    public int removeDuplicates(int[] arr) {
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[j + 1] = arr[i];
                j++;
            }
        }
        return j;
    }
}
