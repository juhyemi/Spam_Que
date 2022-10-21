package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q4949_ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		
		for(int i =1; i<=8; i++) {
			Stack<Character> stack = new Stack<>();
			String s = br.readLine();
			s.toCharArray();
			if(s.charAt(0)==' ') {
				break;
			}
			for(int j=0; j<s.length(); j++) {
			
				char a = s.charAt(j);
			
				if(a == '(') {
					stack.push(a);
				}else if(a==')') {
					if(stack.isEmpty()) {
						sb.append("no"+"\n");
						break;
					}else if(stack.peek()!='(') {
						sb.append("no"+"\n");
						break;
					}else if(stack.peek() == '(') {
						stack.pop();
					}
				}else if(a == '[') {
					stack.push(a);
				}else if(a == ']') {
					if( stack.isEmpty()) {
						sb.append("no" + "\n");
						break;
					}else if(stack.peek() != '[') {
						sb.append("no" + "\n");
						break;
					}else if(stack.peek() == '[') {
						stack.pop();
					}
				}
			
			}if(stack.isEmpty()||s.charAt(0)=='.') {
				sb.append("yes" + "\n");
			}
		
		}
			System.out.println(sb);
			
			
		
	}

}
