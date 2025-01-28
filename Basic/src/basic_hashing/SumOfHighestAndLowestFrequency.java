package basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndLowestFrequency {
    public static void main(String[] args) {
        SumOfHighestAndLowestFrequency s = new SumOfHighestAndLowestFrequency();
        System.out.println(s.sumHighestAndLowestFrequency(new int[]{10, 9, 7, 7, 8, 8, 8}));
    }

    public int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (maxFreq < value) {
                maxFreq = value;
            }

            if (minFreq > value) {
                minFreq = value;
            }
        }

        return maxFreq + minFreq;
    }
}
