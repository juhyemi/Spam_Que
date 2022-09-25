package stage2;

import java.util.Scanner;

public class q2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
	
		if (M >= 45) {
			System.out.printf("%d %d",H,M-45);
		}else if(H == 0 && M<45) {
			System.out.printf("%d %d",23,(60-45)+M);
		}else if(M<45) {
			System.out.printf("%d %d",H-1,(60-45)+M);
		}
	}
}