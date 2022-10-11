// 구간 합 구하기 4
package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IntervalSum_11659 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		// 수의 개수
		int n = Integer.parseInt(st.nextToken());
		
		// 합을 구해야 하는 횟수
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int[] s = new int[n+1];
		
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			s[i+1] = s[i] +tmp;
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			int intSum = s[end] - s[start-1];
			sb.append(intSum).append("\n");
		}
		System.out.println(sb);
	}
}
