package basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElement {
    public static void main(String[] args) {
        HighestOccurringElement highestOccurringElement = new HighestOccurringElement();
        int ans = highestOccurringElement.mostFrequentElement(new int[]{4, 4, 5, 5, 6});
        System.out.println(ans);

    }

    public int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int largestEl = Integer.MIN_VALUE;
        int occurrence = 0;
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            if (occurrence < map.get(num)) {
                occurrence = map.get(num);
                largestEl = num;
            } else if (occurrence == map.get(num) && largestEl > num) {
                largestEl = num;
            }
        }
        return largestEl;
    }
}
