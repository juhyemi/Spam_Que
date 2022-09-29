import java.util.Scanner;

public class BOJ_11726_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[10001];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i-2] + dp[i-1])%10007;
        }
        System.out.println(dp[N]);
    }
}
