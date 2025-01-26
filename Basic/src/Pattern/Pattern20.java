package Pattern;

public class Pattern20 {
    public static void main(String[] args) {
        Pattern20 p = new Pattern20();
        p.pattern20(1);
    }

    public void pattern20(int n) {
        printUpperPart(n);
        printLowerPart(n);
    }

    private void printLowerPart(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int k = n - 1; k >= 0; k--) {
                if (k > n - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private void printUpperPart(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int k = 0; k < n; k++) {
                if (k >= n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
