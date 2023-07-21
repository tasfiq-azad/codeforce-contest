import java.util.Scanner;

public class CodeForces2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            int maxLen = 0;
            int currLen = 0;

            for (int j = 0; j < n; j++) {
                if (a[j] == 0) {
                    currLen++;
                } else {
                    maxLen = Math.max(maxLen, currLen);
                    currLen = 0;
                }
            }

            maxLen = Math.max(maxLen, currLen);
            System.out.println(maxLen);
        }

        scanner.close();
    }
}
