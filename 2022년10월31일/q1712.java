package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(b>=c) {
			sb.append(-1);
		}else if(b<c) {
			int x = a/(c-b);
			
			while(a/(c-b)>=x) {
				x++;	
			}
			if(a/(c-b) <x) sb.append(x);
		}System.out.println(sb);


	}
}