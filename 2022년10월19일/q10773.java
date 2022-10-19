package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				stack.pop();
			}else {
				stack.push(a);
			}
		}
		
		if(stack.size()!=0) {
			for(int i=0; i<stack.size();i++) {
				sum += stack.get(i);
				
			}
			
		}
		
		
		System.out.println(sum);
		
		
	
	
	}

}
