package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class Q5430 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String f = br.readLine();//수행할 함수
			int n = Integer.parseInt(br.readLine());//들어올 원소개수
			Deque<String> queue = new ArrayDeque<>();
			String s = br.readLine();//원소 배열
			st = new StringTokenizer(s, ",|\\[|\\]");
			while(st.hasMoreTokens()) {
				queue.add(st.nextToken());
			}//숫자 배열 큐로 생성
			String[] arr = f.split("");
			boolean reverse = false;
			boolean flag = true;
			for(int j=0; j<arr.length; j++) {
				String fun = arr[j];
				if(fun.equals("R")) {
					if(queue.isEmpty()) {
						continue;
					}else {
						reverse = !reverse;
					}
				}else if(fun.equals("D")) {
					if(queue.isEmpty()) {
						sb.append("error"+"\n");
						flag = false;
						break;
					}else if(!queue.isEmpty()) {
						if(reverse) {
							queue.pollLast();
						}else {
							queue.pollFirst();
						}
					}
				}			
			}
			if(flag) {
				if(queue.isEmpty()) {
					sb.append("[]"+"\n");
				}else {
					sb.append("[");
					while(!queue.isEmpty()) {
						if(reverse) {
							sb.append(queue.pollLast()+",");
						}else {
							sb.append(queue.pollFirst()+",");
						}
						
					}sb.replace(sb.length()-1, sb.length(), "]").append("\n");
				}
			}else {
				continue;
			}
		}
		System.out.println(sb);		
	}
}