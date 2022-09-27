import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기
public class BOJ_1010_S {
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			sb.append(combi(m, n)).append("\n");
		}
		
		System.out.println(sb);
		
		
		
	}
	
	public static int combi(int n, int r) {
		// 이미 탐색한 경우 바로 반환
		if(dp[n][r] > 0) return dp[n][r];
		
		// n = r, r = 0
		if(n == r || r == 0) return dp[n][r] = 1;
		
		return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}
}
