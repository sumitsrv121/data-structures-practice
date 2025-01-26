package Pattern;

/*
 *****
 *   *
 *   *
 *   *
 *****
 */
public class Pattern21 {
    public static void main(String[] args) {
        Pattern21 p = new Pattern21();
        p.pattern21(4);
    }

    public void pattern21(int n) {
        if (n == 1) {
            System.out.println("*");
            return;
        }
        printBoundary(n);
        designBoundaryWithSpace(n);
        printBoundary(n);
    }

    private void designBoundaryWithSpace(int n) {
        int count = (n - 2);
        for (int i = 0; i < count; i++) {
            printStarPart(n);
        }
    }

    private void printStarPart(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    private void printBoundary(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
