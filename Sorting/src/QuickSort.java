import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        quicksortHelper(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksortHelper(int[] arr, int start, int end) {
        if (start < end) {
            int partIndex = partition(arr, start, end);
            quicksortHelper(arr, start, partIndex - 1);
            quicksortHelper(arr, partIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i <= end && arr[i] <= pivot) {
                i++;
            }

            while (j > start && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, start, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
