package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class q10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Deque <String> dequeue = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			String a = st.nextToken();
			if(a.equals("push_front")) {
				dequeue.addFirst(st.nextToken());
			}else if(a.equals("push_back")) {
				dequeue.addLast(st.nextToken());
			}else if(a.equals("pop_front")){
				if(dequeue.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(dequeue.pollFirst()).append("\n");
				}
			}else if(a.equals("pop_back")) {
				if(dequeue.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(dequeue.pollLast()).append("\n");
				}
			}else if(a.equals("size")) {
				sb.append(dequeue.size()).append("\n");
			}else if(a.equals("empty")) {
				if(dequeue.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
			}else if(a.equals("front")) {
				if(dequeue.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(dequeue.peekFirst()).append("\n");
				}
			}else if(a.equals("back")) {
				if(dequeue.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(dequeue.peekLast()).append("\n");
				}
			}
		}
		System.out.println(sb);
				
	}

}
