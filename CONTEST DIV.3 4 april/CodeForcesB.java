import java.util.*;

public class CodeForcesB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] b = new int[n - 1];

            for (int j = 0; j < n - 1; j++) {
                b[j] = scanner.nextInt();
            }

            int[] a = new int[n];
            a[0] = b[0];

            for (int j = 1; j < n - 1; j++) {
                if (b[j] < a[j - 1]) {
                    a[j] = a[j - 1];
                } else {
                    a[j] = b[j];
                }
            }

            if (b[n - 2] < a[n - 2]) {
                a[n - 1] = a[n - 2];
            } else {
                a[n - 1] = b[n - 2];
            }

            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }

            System.out.println();
        }
    }
}