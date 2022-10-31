import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 손익분기점
public class BOJ_1712_S {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 고정비용
		int A = Integer.parseInt(st.nextToken());
		// 가변비용
		int B = Integer.parseInt(st.nextToken());
		// 가격
		int C = Integer.parseInt(st.nextToken());
		
		if(B >= C) {
			System.out.println(-1);
		}else {
			System.out.println(A/(C-B) + 1);
		}
	}
}
