package basic_recursion;

import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        ReverseArrayElements r = new ReverseArrayElements();
        System.out.println(Arrays.toString(r.reverseArray(new int[]{1, 2, 3, 4, 5})));
    }

    public int[] reverseArray(int[] nums) {
        return reverseEl(nums, 0, nums.length - 1);
    }

    private int[] reverseEl(int[] nums, int left, int right) {
        if (left >= right) {
            return nums;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        return reverseEl(nums, left + 1, right - 1);
    }
}
