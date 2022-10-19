package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int j=1; j<=n; j++) {
			String s = br.readLine();
			s.toCharArray();
		
			int a = 0;
			int b = 0;
			for(int i=0; i<s.length() ; i++) {
				
				if(s.charAt(i) == '(') {
					a ++;
				}else if(s.charAt(i) == ')') {
					b++;
					
				}if(a<b) {
					sb.append("NO"+"\n");
					break;
				}
			}
			if(a==b) {
				sb.append("YES" + "\n");
			}else if(a>b) {
				sb.append("NO" + "\n");
			}
			
		}System.out.println(sb);
		
	}

}
