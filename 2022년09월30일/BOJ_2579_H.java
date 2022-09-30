import java.util.Scanner;

public class BOJ_2579_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] stair = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            stair[i] = sc.nextInt();
        }
        check(stair);
    }
    public static void check(int[] stair){
        int[] dp = new int[stair.length];
        dp[1] = stair[1];
        // N이 2로 나오면 모든 값을 더해 주는 것이 정답임으로 가정문으로 처리.
        if (dp.length >= 3) dp[2] = stair[1]+stair[2];
        for (int i = 3; i < dp.length; i++) {
            int max = stair[i]+Math.max(dp[i-2],dp[i-3]+stair[i-1]);
            dp[i] = max;
        }
        System.out.println(dp[dp.length-1]);
    }
}
// 이 방식은 옳은 유도식이 아니였다.....
// i-2와 i-3 + i-1의 값을 비교해야 한다.
// 이렇게 되면 count 변수도 필요 없다. 이미 내 선택지에 3회 연속으로 체크되는 일이 없기 때문에
//        for (int i = 3; i < dp.length; i++) {
//        int max = stair[i]+Math.max(dp[i-1],dp[i-2]);
//        if (max == stair[i]+dp[i-1]) {
//        count++;
//        }
//        if (count == 3){
//        dp[i] = stair[i]+dp[i-2];
//        count = 0;
//        }
//        else dp[i] = max;
//        }