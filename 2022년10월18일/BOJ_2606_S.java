import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 바이러스
public class BOJ_2606_S {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()); 	// 컴퓨터의 수
		int m = Integer.parseInt(br.readLine());	// 컴퓨터 쌍의 수
		
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		for(int i=1; i<n+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		
		DFS(1);
		int cnt = 0;
		for(int i=2; i<n+1; i++) {
			if(visited[i]) cnt++;
		}
		
		System.out.println(cnt);	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	}
	
	static void DFS(int n) {
		if(visited[n]) {
			return;
		}
		visited[n] = true;
		for(int i : A[n]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
}
