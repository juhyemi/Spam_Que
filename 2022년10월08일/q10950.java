package Bjalgorism;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int T = sc.nextInt();
		
		for(int i = 1 ; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			queue.add(A+B);
			
		}
		
		for(int j=0; j <T; j++) {
			System.out.println(queue.poll());
			
		}
		
	}

}
