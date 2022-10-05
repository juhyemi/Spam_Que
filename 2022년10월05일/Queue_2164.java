// 카드2
package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 카드에 1~n까지의 숫자를 순서대로 입력
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		while(queue.size() > 1) {
			// 가장 앞에 있는 숫자를 뺀다.
			queue.poll();
			// 다음 카드는 뒤로 옮긴다.
			int tmp = queue.poll();
			queue.add(tmp);
		}
		
		System.out.println(queue.peek());
		
	}
}
