
import java.util.Scanner;

public class CodeForcesA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            String num = scanner.next();
            StringBuilder result = new StringBuilder(num);
            int i = 0;
            while (i < n && num.charAt(i) >= d + '0') {
                i++;
            }
            result.insert(i, d);
            System.out.println(result.toString());
            t--;
        }
    }
}
