package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(bf.readLine());
		int[] ls = new int [n];
		double max = 0;
		st = new StringTokenizer(bf.readLine());
		for(int i =0;i<n;i++) {
			ls[i] = Integer.parseInt(st.nextToken());
			
			if(ls[i]>max) {
				max = ls[i];//max값 구하기
			}
		}
		double score = 0;
		for(int i=0; i<n; i++) {
			score += ls[i]/max * 100.0;
		}
		System.out.println(score/n);
		
		
	}

}
