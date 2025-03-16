package basic;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        MaximumConsecutiveOnes mco = new MaximumConsecutiveOnes();
        int maxConsecutiveOnes = mco.findMaxConsecutiveOnes(arr);
        System.out.println(maxConsecutiveOnes);
    }

    public int findMaxConsecutiveOnes(int[] arr) {
        int maxOccurrence = 0;
        int currentOccurrence = 0;
        for (int num : arr) {
            if (num == 1) {
                currentOccurrence++;
                if (maxOccurrence < currentOccurrence) {
                    maxOccurrence = currentOccurrence;
                }
            } else {
                currentOccurrence = 0;
            }
        }
        return maxOccurrence;
    }
}
