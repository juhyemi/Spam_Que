package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class q4344 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int c = Integer.parseInt(br.readLine());
		
		
		for(int i = 1; i <=c;i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			int sub = Integer.parseInt(st.nextToken());
			List<Integer> ls = new ArrayList<>();
			for(int j =1; j<=sub; j++) {
				ls.add(Integer.parseInt(st.nextToken()));
				
			}
			double count = 0.0;
			double score = 0.0;
			for(int k=0;k<sub;k++) {
				score += ls.get(k);
				
			}
			for(int l =0;l<sub;l++) {
				if(ls.get(l)>(score/sub)) {
					count++;
				}
			}sb.append(String.format("%.3f",(count/sub)*100)+"%"+"\n");
			
		
			
		}System.out.println(sb);
		
		

	
	
	
	
	}

}
