package stage1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a[] = new int [9];
		for(int i = 0; i<9; i++) {
			String s = bf.readLine();
			st = new StringTokenizer(s);
			a[i]= Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int idx = 0;
		for(int i =0; i<9;i++) {
			if(a[i]>max) {
				max = a[i];
				idx = i;
			}
		}System.out.println(max+"\n"+idx);
	}

}
