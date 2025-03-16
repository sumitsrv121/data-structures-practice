package basic;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 0, 99, -40};
        LargestElement le = new LargestElement();
        int ans = le.largestElement(arr);
        System.out.println(ans);
    }

    public int largestElement(int[] arr) {
        int MAX_NUM = Integer.MIN_VALUE;

        for (int num : arr) {
            if (MAX_NUM < num) {
                MAX_NUM = num;
            }
        }
        return MAX_NUM;
    }
}
