package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class q11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int [] c = new int[n];
		for(int i = 1; i<=n;i++ ) {
			String s = bf.readLine();
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			c[i-1] = a+b;
		}
		
		for (int i = 0;i<n;i++) {
			System.out.println("Case #"+(i+1)+": "+ c[i]);
		}
		
		
	}

}
