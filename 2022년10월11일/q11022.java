package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q11022 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(bf.readLine());
		int []c = new int[t];
		int []a1 =new int[t];;
		int []b1 =new int[t];;
		for(int i = 1; i<=t;i++) {
			String s = bf.readLine();
			st = new StringTokenizer(s);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			c[i-1] = a+b;
			a1[i-1] = a;
			b1[i-1] = b;
			
			
		}
		for(int j =0;j<t;j++) {
			System.out.println("Case #" + (j+1) + ": "+ a1[j] + " + " + b1[j]+" = "+c[j]);
		}
		
		
		
		
		
		
	}

}
