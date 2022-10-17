import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블로그

public class BOJ_21921_S {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 블로그를 시작한 일 수 
		int N = Integer.parseInt(st.nextToken());
		// 알고 싶은 기간
		int X = Integer.parseInt(st.nextToken());
		
		// 1~N일차 까지 블로그 방문자 수
		st = new StringTokenizer(br.readLine());
		int[] visited = new int[N];
		for(int i=0; i<N; i++) {
			visited[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		// 초기
		for(int i=0; i<X; i++) {
			sum += visited[i];
		}
		
		int max = sum;
		int cnt = 1;
		
		// 슬라이딩 윈도우
		for(int i=X; i<N; i++) {
			int j=i-X;
			sum -= visited[j];
			sum += visited[i];
			if(sum > max) {
				max = sum;
				cnt = 1;
			}else if(sum == max) {
				cnt++;
			}
		}
		
		if(max == 0) System.out.println("SAD");
		else {
			System.out.println(max);
			System.out.println(cnt);
		}	
	}
}
