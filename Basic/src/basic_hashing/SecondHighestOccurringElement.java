package basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccurringElement {
    public static void main(String[] args) {
        SecondHighestOccurringElement s = new SecondHighestOccurringElement();
        System.out.println(s.secondMostFrequentElement(new int[]{4, 4, 5, 5, 6, 7, 7, 1, 1}));

    }

    public int secondMostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        int maxOccurrence = Integer.MIN_VALUE;
        int secondMaxOccurrence = Integer.MIN_VALUE;
        int maxNumber = -1;
        int secondMaxNumber = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (maxOccurrence < value) {
                secondMaxNumber = maxNumber;
                secondMaxOccurrence = maxOccurrence;
                maxNumber = key;
                maxOccurrence = value;
            } else if (secondMaxOccurrence < value && value != maxOccurrence) {
                secondMaxNumber = key;
                secondMaxOccurrence = value;
            } else if (secondMaxOccurrence == value && secondMaxNumber > key) {
                secondMaxNumber = key;
            }
        }

        return secondMaxNumber;
    }
}
