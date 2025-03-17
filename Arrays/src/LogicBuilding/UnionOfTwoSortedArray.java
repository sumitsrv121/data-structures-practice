package LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};
        UnionOfTwoSortedArray unionOfTwoSortedArray = new UnionOfTwoSortedArray();
        System.out.println(Arrays.toString(unionOfTwoSortedArray.unionArray(nums1, nums2)));
    }

    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        int left = 0;
        int right = 0;

        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] < nums2[right]) {
                if (al.isEmpty() || al.getLast() != nums1[left]) {
                    al.add(nums1[left]);
                }
                left++;
            } else {
                if (al.isEmpty() || al.getLast() != nums2[right]) {
                    al.add(nums2[right]);
                }
                right++;
            }
        }

        while (left < nums1.length) {
            if (al.get(al.size() - 1) != nums1[left]) {
                al.add(nums1[left]);
            }
            left++;
        }

        while (right < nums2.length) {
            if (al.get(al.size() - 1) != nums2[right]) {
                al.add(nums2[right]);
            }
            right++;
        }

        return al.stream().flatMapToInt(IntStream::of).toArray();
    }
}
