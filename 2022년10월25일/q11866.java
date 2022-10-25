package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class q11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<Integer> ls = new ArrayList<>();
		List<Boolean> b = new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int term = Integer.parseInt(st.nextToken());
		sb.append("<");
		
		int count = 1;
		for(int i=0; i<n; i++) {
			ls.add(i+1);
			b.add(false);
		}//list에 1부터 n까지의 숫자 넣기
			
		int i=0;
		while(b.contains(false)) {
			if(b.get(i)==false) {
				if(count==term) {
					sb.append(ls.get(i)).append(", ");
					count=1;
					b.set(i, true);
				}else {
					count++;
				}
				if(i==6) {
					i=0;
				}else {
					i++;
				}
			
			}else if(b.get(i)==true) {
				if(i==6) {
					i=0;
				}else {
					i++;
				}
		
		}
		    	
		    
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		
		System.out.println(sb);
		
	}

}
