// DFS와 BFS
package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS_1260 {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 정점의 개수
		int m = Integer.parseInt(st.nextToken());	// 간선의 개수
		int v = Integer.parseInt(st.nextToken());	// 탐색을 시작할 정점의 번호
		
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
		
		for(int i=1; i<n+1; i++) {
			Collections.sort(A[i]);
		}
		
		DFS(v);
		visited = new boolean[n+1];
		sb.append("\n");
		BFS(v);
		
		System.out.println(sb);
	}
	
	static void DFS(int n) {
		if(visited[n]) {
			return;
		}
		visited[n] = true;
		sb.append(n).append(" ");
		for(int i : A[n]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	// BFS 구현하기
	private static void BFS(int n) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int now_n = queue.poll();
			sb.append(now_n).append(" ");
			for(int i : A[now_n]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
