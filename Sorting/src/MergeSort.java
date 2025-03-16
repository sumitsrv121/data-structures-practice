import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};
        mergeSortHelper(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortHelper(arr, start, mid);
        mergeSortHelper(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= end) {
            temp.add(arr[right++]);
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }
}
