import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 트리의 부모 찾기
public class BOJ_11725_S {
	static boolean[] visited;
	static ArrayList<Integer>[] A;
	static int[] result;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		result = new int[n+1];
		
		for(int i=1; i<n+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<n-1; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i=2; i<n+1; i++) {
			Collections.sort(A[i]);
		}
		
		DFS(1);
		
		for(int i=2; i<n+1; i++) {
			sb.append(result[i]).append("\n");
		}
		System.out.println(sb);
	}
	
	static void DFS(int n) {
		if(visited[n]) {
			return;
		}
		visited[n] = true;
		for(int i : A[n]) {
			if(!visited[i]) {
				result[i] = n;
				DFS(i);
			}
		}
	}
}
