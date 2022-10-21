package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q4949 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		String s = br.readLine();
		s.toCharArray();
		for(int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			if(s.charAt(0)==' ') break;
			if(s.charAt(0)=='.') {
				sb.append("yes"+"\n");
				break;
			}
			if(a == '(') {
				stack.push(a);
				stack2.push(a);
			}else if(a ==')') {
				if(stack.isEmpty()||stack2.isEmpty()) {
					sb.append("no"+"\n");
					break;
					
				}else {
					if(stack2.peek()=='[') {
						sb.append("no"+"\n");
						break;
					}else {
						stack.pop();
						stack2.pop();
					
						
					}
					
					
				}
			}else if(a =='[') {
				stack1.push(a);
				stack2.push(a);
			}else if(a ==']') {
				if(stack1.isEmpty()||stack2.isEmpty()) {
					sb.append("no"+"\n");
					break;
				}else {
					if(stack2.peek()=='(') {
						sb.append("no"+"\n");
						break;
					}else {
						stack1.pop();
						stack2.pop();
					}
				}
			}else if(stack.isEmpty() || stack1.isEmpty()) {
			
					sb.append("yes"+"\n");
				
				
			}
		}System.out.println(sb);
	}

}
