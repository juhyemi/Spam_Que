package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class q1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringTokenizer st1;
		Deque<Integer> que = new ArrayDeque<>();
		Deque<Integer> que1 = new ArrayDeque<>();
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			que.add(i);
			que1.add(i);
		}
		String p = br.readLine();
		st1 = new StringTokenizer(p);
		int decount =0;
		int count =0;
		int total = 0;
		
		for(int i=1; i<=m; i++) {
			count = 0;
			decount=1;
			int l = 0;
			int a = Integer.parseInt(st1.nextToken());
			while ((l = que.pollFirst())!=a) {
				que.add(l);
				count++;
			}
			
			while((l=que1.pollLast())!=a) {
				que1.addFirst(l);
				decount++;
			}
		
			if(count>decount) {
				total += decount;
				que.clear();
				for(int k:que1) {
					que.add(k);
				}
			}else if(count<=decount){
				total += count;
				que1.clear();
				for(int k:que) {
					que1.add(k);
				}
			}
		}System.out.println(total);
		
		
		
		
		
		
	}

}
