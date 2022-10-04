package Bjalgorism;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q2164 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//카드 개수
		
		Queue<Integer> queue = new LinkedList<>();//큐 선언
		
		for (int i =1; i<=n; i++) {
			queue.add(i);
		}
		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
			
		}
		System.out.println(queue.poll());
		
		
		
		
		
	}

}
