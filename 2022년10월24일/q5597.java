package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class q5597 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		List<Integer> ls = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		int []a = new int[30];
		
		for(int i=0; i<28; i++) {
			ls.add(Integer.parseInt(br.readLine()));
		}
		for(int i=0; i<30; i++) {
			a[i] = i+1;
			
			if(!ls.contains(a[i])) {
				answer.add(a[i]);
			}
		}
		int max = 1;
		int min = 1;
		for(int i=0; i<answer.size(); i++) {
			if(answer.get(i) >max) {
				min = max;
				max = answer.get(i);
			}
		}
		sb.append(min).append("\n").append(max);
		System.out.println(sb);
	}

}
