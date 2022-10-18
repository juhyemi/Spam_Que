package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		
		Queue <String> myQueue= new LinkedList<>();
		for (int i=1;i<=n;i++) {//게임 수
			String test = bf.readLine();
			st = new StringTokenizer(test);
			
			while(st.nextToken()!=null) {

				myQueue.add(st.nextToken());//한 게임의 OX결과
			}
			int count = 0;
			if(myQueue.poll()=="O") {
				count ++;
				sb.append(count+"\n");
			}else continue;
		}System.out.println(sb);
		
	}

}
