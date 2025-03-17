package LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {-45, -45, 0, 0, 2};
        int[] nums2 = {-50, -45, 0, 0, 5, 7};
        InsertionOfTwoSortedArrays insertionOfTwoSortedArrays = new InsertionOfTwoSortedArrays();
        int[] ans = insertionOfTwoSortedArrays.intersectionArray(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        int left = 0;
        int right = 0;

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] < nums2[right]) {
                left++;
            } else if (nums1[left] > nums2[right]) {
                right++;
            } else {
                al.add(nums1[left]);
                left++;
                right++;
            }
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}
