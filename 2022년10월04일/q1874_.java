package Bjalgorism;

import java.util.Scanner;
import java.util.Stack;


public class q1874_ {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]a = new int[n];
		
		for(int i = 0; i < n; i++) {
			
			a[i] = sc.nextInt();
		}//입력한 배열까지 만들었고
		Stack<Integer> stack = new Stack<>();//자연수랑 현재 배열 값이 랑 같으면 넣어줘야하고
		StringBuffer bf = new StringBuffer();//넣으면 + 빼면 -를 여기다가 넣고
		
		int k = 1; //자연수
		boolean result = true;
		for(int j=0;j<a.length;j++) {
			int su = a[j];
			if(su>=k) {
				while(su>=k) {
					stack.push(k++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}else {
				int m = stack.pop();
				if(m>su) {
					System.out.println("No");
					result = false;
					break;
					
				}else {
					bf.append("-\n");
				}
				
				
			}		
		
		}
		
		if(result) {
			System.out.println(bf.toString());
		}
		
		
		
	}

}
