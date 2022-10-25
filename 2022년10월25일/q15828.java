package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class q15828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		Queue <Integer> queue = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());//queue size
		
		int a;
		while((a=Integer.parseInt(br.readLine())) != -1) {
			
			if(a>0) {
				if(queue.size()<n) queue.add(a);
				
			}else if(a == 0) queue.poll();
			
		
		}
		if(queue.isEmpty()) sb.append("empty");
		else {
			while(!queue.isEmpty()) {
				sb.append(queue.poll()).append(" ");
			}
		}System.out.println(sb);
		
		
	}

}
