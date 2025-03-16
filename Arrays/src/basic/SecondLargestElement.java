package basic;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        SecondLargestElement sle = new SecondLargestElement();
        int ans = sle.secondLargestElement(arr);
        System.out.println(ans);
    }

    public int secondLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (max < num) {
                secondMax = max;
                max = num;
            } else if (max > num && secondMax < num) {
                secondMax = num;
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }
}
