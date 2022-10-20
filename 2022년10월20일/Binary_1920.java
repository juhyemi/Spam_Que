package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Binary_1920 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		Arrays.sort(A);
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(check(A, x)) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	static boolean check(int[] arr, int n) {
		boolean result = false;
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int idx = (start+end)/2;
			
			if(n == arr[idx]) {
				result = true;
				break;
			}
			
			if(n < arr[idx]) {
				end = idx-1;
			}
			else if(n > arr[idx]) {
				start = idx+1;
			}
		}
		return result;
	}
}
