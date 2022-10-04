package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_1874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int num = 1;
		boolean result = true;
		
		for(int i=0; i<n; i++) {
			int su = arr[i];
			if(su >= num) {
				while(arr[i] >= num) {
					stack.push(num++);
					sb.append("+").append("\n");
				}
				stack.pop();
				sb.append("-").append("\n");
			}
			else {
				int tmp = stack.pop();
				if(tmp > su) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					sb.append("-").append("\n");
				}
			}
		}
		
		if(result) System.out.println(sb);
	}
}
