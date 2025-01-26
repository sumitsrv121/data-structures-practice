package basic_array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        new ReverseAnArray().reverse(arr, 5);
    }

    public void reverse(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
