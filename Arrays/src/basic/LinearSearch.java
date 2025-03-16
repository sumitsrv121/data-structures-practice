package basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, -4, 4, 0, 10, 6, 4};
        int target = 6;

        LinearSearch ls = new LinearSearch();
        int ans = ls.linearSearch(arr, target);
        System.out.println(ans);
    }

    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
