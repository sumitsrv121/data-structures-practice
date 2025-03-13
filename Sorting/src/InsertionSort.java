import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        InsertionSort is = new InsertionSort();
        System.out.println(Arrays.toString(is.insertionSort(arr)));
    }

    public int[] insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int hole = i;
            int num = nums[hole];
            while (hole > 0 && num < nums[hole - 1]) {
                nums[hole] = nums[hole - 1];
                hole--;
            }
            nums[hole] = num;
        }
        return nums;
    }
}
