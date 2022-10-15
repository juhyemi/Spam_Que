package stage1;


import java.io.InputStreamReader;
import java.util.Scanner;

public class q10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();
		int x = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			if(a[i]<x) {
				sb.append(a[i]+" ");
			}
		}
		System.out.println(sb);
		
	
	
	
	}

}
