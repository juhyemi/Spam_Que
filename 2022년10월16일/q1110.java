package stage1;

import java.util.Scanner;

public class q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;//루프가 돌아간 횟수
		int su = 0;
		int a=n%10;//일의 자리 수
		int b=n/10;//십의 자리 수
		if(n<10) {
			n = n*10;
			count ++;
		}
		while(n!=su) {
			if(a+b>=10) {
				su = a*10 + (a+b)%10;
				count ++;
				a = su%10;
				b = su/10;
			}else {
				su = a*10 + (a+b);
				count ++;
				a = su%10;
				b = su/10;
			}
		}System.out.println(count);
		
		
	}

}
