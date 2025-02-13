package basic_recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySorted {
    public static void main(String[] args) {
        ArraySorted as = new ArraySorted();
        boolean sorted = as.isSorted(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        System.out.println(sorted);
    }

    public boolean isSorted(ArrayList<Integer> nums) {
        return checkIfArraySorted(0, nums);
    }

    private boolean checkIfArraySorted(int start, ArrayList<Integer> nums) {
        if (start >= nums.size() - 1) {
            return true;
        }

        if (nums.get(start) > nums.get(start + 1)) {
            return false;
        }
        return checkIfArraySorted(start + 1, nums);
    }
}
