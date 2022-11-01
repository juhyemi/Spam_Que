package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 1;
		int range = 1;
		while(n>range) {
			range += answer*6 ;
			answer++;
		}System.out.println(answer);
	}
}
