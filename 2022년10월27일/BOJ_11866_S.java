import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 요세푸스 문제 0
public class BOJ_11866_S {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		sb.append("<");
		
		Queue<Integer> que = new LinkedList<>();
		// 큐에 1~n까지 숫자 삽입
		for(int i=1; i<=n; i++) {
			que.add(i);
		}
		
		int cnt = 1;
		while(que.size() != 1) {
			if(cnt != k) {
				int a = que.poll();
				que.add(a);
				cnt++;
			}else if(cnt == k) {
				int a = que.poll();
				sb.append(a).append(", ");
				cnt = 1;
			}
		}
		sb.append(que.poll());
		sb.append(">");
		System.out.println(sb);
	}
}
