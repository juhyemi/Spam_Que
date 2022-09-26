package stage2;

import java.util.Scanner;

public class q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		

		if(A+(B+C)/60 >= 24) {
		    System.out.printf("%d %d",(A+(B+C)/60)-24,(B+C)%60);
		}else if(B+C>=60) {
			System.out.printf("%d %d",A+(B+C)/60,(B+C)%60);
		}else {
			System.out.printf("%d %d", A, B+C);
	    }
		
	}

}
