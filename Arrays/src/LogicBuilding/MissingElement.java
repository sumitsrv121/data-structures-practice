package LogicBuilding;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 4};
        MissingElement missingElement = new MissingElement();
        int ans = missingElement.missingNumber(arr);
        System.out.println(ans);
    }

    public int missingNumber(int[] arr) {
        int indexXor = 0;
        int elementXor = arr.length;
        for (int i = 0; i < arr.length; i++) {
            indexXor ^= i;
            elementXor ^= arr[i];
        }

        return indexXor ^ elementXor;
    }
}
