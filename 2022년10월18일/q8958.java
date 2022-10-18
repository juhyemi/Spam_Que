package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());//테스트 개수


		for(int i =1; i<=n;i++) {
			String test = bf.readLine();//ox 한 줄
			char [] ch = test.toCharArray();
			int count = 0;
			int sum = 0;
			for(int j=0; j<ch.length; j++) {
				if(ch[j] == 'O') {
					count++;
					sum += count;
				}else if(ch[j] == 'X') {
					count = 0;
				}
				
			}sb.append(sum+"\n");
		}System.out.println(sb);

	}

}
