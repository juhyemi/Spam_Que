// 프린터 큐
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966_S {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			Queue<int[]> q = new LinkedList<>();
			PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o2[1] - o1[1];
				}
			});

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				int[] arr = { i, Integer.parseInt(st.nextToken()) };
				q.add(arr);
				pq.add(arr);
			}
			int cnt = 0;
			while(!pq.isEmpty()) {
				int max = pq.poll()[1];
				while(true) {
					int[] pri = q.poll();
					if(max == pri[1]) {
						cnt++;
						if(pri[0] == m) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
							sb.append(cnt).append("\n");
						}
						break;
					}else {
						q.add(pri);
					}
				}
			}
		}
		System.out.println(sb);
	}
}
