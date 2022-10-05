// 수들의 합 5
package dataStructure;

import java.util.Scanner;

public class TwoPointer_2018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 1;
		int start_idx = 1;
		int end_idx = 1;
		int sum = 1;
		
		while(end_idx != n) {
			if(sum == n) {
				cnt++;
				end_idx++;
				sum += end_idx;
			}
			else if(sum > n) {
				sum -= start_idx;
				start_idx++;
			} else {
				end_idx++;
				sum += end_idx;
			}
		}
		
		System.out.println(cnt);
	}
}
