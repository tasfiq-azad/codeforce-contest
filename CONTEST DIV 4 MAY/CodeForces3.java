import java.util.Scanner;

public class CodeForces3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int skill1 = 0, skill2 = 0;
            int minTime = Integer.MAX_VALUE;
            boolean possible = false;
            for (int i = 0; i < n; i++) {
                int m = input.nextInt();
                String skills = input.next();
                if (skills.charAt(0) == '1') {
                    skill1++;
                }
                if (skills.charAt(1) == '1') {
                    skill2++;
                }
                if (skill1 >= 1 && skill2 >= 1) {
                    possible = true;
                    minTime = Math.min(minTime, m);
                }
            }
            if (possible) {
                System.out.println(minTime);
            } else {
                System.out.println("-1");
            }
        }
    }
}
