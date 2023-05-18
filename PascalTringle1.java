//Rony Ahmmed BDU-EdTech
import java.util.Scanner;
public class PascalTringle1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        n--;
        for(int i = 0; i <= n; i++) { 
            sum+= cal(n, i);
        }
        System.out.println(sum);
    }
    
    public static int cal (int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        
        int[][] dp = new int[n + 1][r + 1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        
        return dp[n][r];
    }
}
