// 주유소
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13305_S {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 도시의 개수
		int n = Integer.parseInt(br.readLine());

		// 도로의 길이
		long[] dist = new long[n - 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<dist.length; i++) {
			dist[i] = Integer.parseInt(st.nextToken());
		}
		

		// 기름 가격
		long[] oil = new long[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<oil.length; i++) {
			oil[i] = Integer.parseInt(st.nextToken());
		}

		br.close();
		
		
		long min = oil[0];
		// 기름 가격을 내림차순으로 만들어준다.
		for(int i=1; i<oil.length; i++) {
			if(oil[i] > min) {
				oil[i] = min;
			}else {
				min = oil[i];
			}
		}
		
		long cost = 0;
		for(int i=0; i<dist.length; i++) {
			cost += dist[i]*oil[i];
		}
		
		System.out.println(cost);
	}

}
