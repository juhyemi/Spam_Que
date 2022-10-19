package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class q10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());//입력횟수
		
		for(int i=1; i<=n; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			String a = st.nextToken();
			if(a.equals("push")) {
				int b = Integer.parseInt(st.nextToken());
				stack.push(b);
				
			}else if(a.equals("top")) {
				if(stack.empty()) {
					sb.append(-1+"\n");
				}else{
					sb.append(stack.peek()+"\n");
				}
				
				
				
			}else if(a.equals("pop")) {
				if(stack.empty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(stack.pop()+"\n");
				}
			}else if(a.equals("empty")) {
				if(stack.empty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0+"\n");
				}
			}else if(a.equals("size")) {
				sb.append(stack.size()+"\n");
			}
		}System.out.println(sb);
		
	}

}
