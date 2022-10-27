package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class q11866_timeout {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		st= new StringTokenizer(s);
		List<Integer> ls = new LinkedList<>();
		int n = Integer.parseInt(st.nextToken());
		int term = Integer.parseInt(st.nextToken());
		Queue <Integer> queue = new LinkedList<>();
		sb.append("<");	
		for(int i=1;i<=n; i++) {
			queue.add(i);
		}
		int index = 0;
		while(!queue.isEmpty()) {
			if(term-1!=index) {
				queue.add(queue.poll());
				index++;
			}else {
				sb.append(queue.poll()+", ");
				index=-1;
				index++;
			}
			//if(index==queue.size()) index=0;
			
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.print(sb);
	
		
	}

}
