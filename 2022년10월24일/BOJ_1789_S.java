import java.util.Scanner;

// 수들의 합
public class BOJ_1789_S {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		long sum = 0;
		int cnt = 0;

		for(int i=1; ; i++) {
			if(sum > s) break;
			sum += i;
			cnt++;
		}
		
		System.out.println(cnt-1);
	}
}
