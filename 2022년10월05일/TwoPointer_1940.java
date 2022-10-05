// 주몽
package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointer_1940 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 재료의 개수
		int n = Integer.parseInt(br.readLine());
		
		// 값옷을 만드는데 필요한 수
		int m = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		int i = 0;
		int j = n-1;
		
		while(i < j) {
			if(arr[i] + arr[j] < m) {
				i++;
			}
			else if(arr[i] + arr[j] > m) {
				j--;
			}
			else {
				cnt++;
				i++;
				j--;
			}
		}
		
		System.out.println(cnt);
	}
}
