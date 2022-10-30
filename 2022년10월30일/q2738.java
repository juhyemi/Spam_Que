package stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2738 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String s = br.readLine();
		st = new StringTokenizer(s);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] a = new int [n][m];
		
		for(int w=0;w<2;w++) {
			for(int i=0; i<n; i++) {
				String k = br.readLine();
				st = new StringTokenizer(k);
				for(int j=0; j<m; j++) {				
					a[i][j] += Integer.parseInt(st.nextToken());
				}
			}
		
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		
		
		
	}
}
