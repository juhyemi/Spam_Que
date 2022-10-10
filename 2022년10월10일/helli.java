package stage1;

import java.util.Scanner;

public class helli {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = 3;
		
		int success = 0;
		for(int i=1; i<=t; i++) {//t번 입력
			int cx = sc.nextInt();
			int cy = sc.nextInt();
			int r = sc.nextInt();
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			if(cx+r>=sx&&cy+r>=sy) {
				success = 1;
				sb.append("#"+i+" "+success).append("\n");
				
			}else {
				success = 0;
				sb.append("#"+i+" "+success).append("\n");
			}	
			
		}System.out.println(sb);
		
		
		
		
		
	}

}
