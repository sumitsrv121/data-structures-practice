package Pattern;

/*
n = 5
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
 */

public class Pattern22 {
    public static void main(String[] args) {
        Pattern22 p = new Pattern22();
        p.pattern22(5);

    }

    public void pattern22(int n) {
        //printUpperHalf(n);
        //printLowerHalf(n);
        easiestWay(n);
    }

    private void printLowerHalf(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print(n - j + " ");
                } else {
                    System.out.print(i + 1 + " ");
                }
            }
            for (int j = 0; j < n - 1; j++) {
                if (j < i) {
                    System.out.print(i + 1 + " ");
                } else {
                    System.out.print(j + 2 + " ");
                }
            }
            System.out.println();
        }
    }

    private void printUpperHalf(int n) {
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(n - k + " ");
                    k++;
                } else {
                    System.out.print(n - i + " ");
                }
            }

            for (int j = n - 1; j > 0; j--) {
                if (j > i) {
                    System.out.print(n - i + " ");
                } else {
                    System.out.print(n - k + 1 + " ");
                    k--;
                }
            }
            System.out.println();
        }
    }

    public void easiestWay(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int bottom = 2 * n - 2 - i;
                int right = 2 * n - 2 - j;

                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
