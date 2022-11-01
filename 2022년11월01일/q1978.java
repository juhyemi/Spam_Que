package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		st = new StringTokenizer(s);
		int count = 0;
		for(int i =1; i<=n; i++) {
			int check = 0;
			int num = 2;
			int so = Integer.parseInt(st.nextToken());
			while(so != num) {
					if(so==1||so==0) {
						check++;
						break; 
					}
					if(so%num == 0) {
						check++;
						break;
					}else num++;						
			}if(check==0) count++;			
		}System.out.println(count);
		
	}

}
