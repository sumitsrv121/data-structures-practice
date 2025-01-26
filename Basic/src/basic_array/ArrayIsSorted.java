package basic_array;

public class ArrayIsSorted {
    public static void main(String[] args) {
        ArrayIsSorted arrayIsSorted = new ArrayIsSorted();
        System.out.println(arrayIsSorted.arraySortedOrNot(new int[]{5, 4, 6, 7, 8}, 5));
    }

    boolean arraySortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
