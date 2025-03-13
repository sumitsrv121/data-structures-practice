import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {7, 4, 1, 5, 3};
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(nums)));
    }

    public int[] bubbleSort(int[] nums) {
        // bubble up to end
        for (int i = 0; i < nums.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return nums;
            }
        }
        return nums;
    }
}
