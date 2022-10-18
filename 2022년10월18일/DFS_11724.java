// 연결 요소의 개수
package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS_11724 {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 정점의 개수
		int n = Integer.parseInt(st.nextToken());
		// 간선의 개수
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n+1];
		visited = new boolean[n+1];
		
		// 인접 리스트 초기화하기
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		// 양방향 에지이므로 양쪽에 에지를 더하기
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			list[s].add(e);
			list[e].add(s);
		}
		
		int cnt = 0;
		for(int i=1; i<=n; i++) {
			// 방문하지 않은 노드가 없을 때까지 반복하기
			if(!visited[i]) {
				cnt++;
				DFS(i);
			}
		}
		System.out.println(cnt);
		
	}
	
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i : list[v]) {
			// 연결 노드 중 방문하지 않았던 노드만 탐색하기
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
}
