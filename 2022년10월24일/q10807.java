package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class q10807 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		List<Integer> ls = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		st = new StringTokenizer(s);
		int find = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=1; i<=n; i++) {		
			ls.add(Integer.parseInt(st.nextToken()));
		}
		for(int i=0; i<ls.size(); i++) {
			if(ls.get(i)==find) {
				count++;
			}
		}System.out.println(count);
		
	}

}
