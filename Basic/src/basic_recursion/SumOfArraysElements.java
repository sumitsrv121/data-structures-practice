package basic_recursion;

public class SumOfArraysElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        SumOfArraysElements s = new SumOfArraysElements();
        int i = s.arraySum(arr);
        System.out.println(i);
    }

    public int arraySum(int[] nums) {
        return sum(0, nums);
    }


    private int sum(int index, int[] nums) {
        if (index == nums.length) {
            return 0;
        }
        return nums[index] + sum(index + 1, nums);
    }
}
