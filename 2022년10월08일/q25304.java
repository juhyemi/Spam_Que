package Bjalgorism;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q25304 {
	public static void main(String[] args) {
		Queue<Integer> queue2 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

		
		int i = 0;
		int n = 0;
		
		while(i<N) {
			int a = sc.nextInt();
     		int b = sc.nextInt();
			queue2.add(a*b);
			i++;
			
		}


		for(i = 0;i<N;i++) {
			n += queue2.poll();
		}
		if(n == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
