package stage1;

import java.util.Scanner;

public class q2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int sec = sc.nextInt(); //스텍처럼 하나씩 넣고 뒷 숫자부터 빼내서 fir이랑 곱해주고 싶음
		
		int thd = fir * (sec%10);//fir * sed의 마지막 입력 숫자
		int th4 = fir * (sec%100-sec%10);
		int th5 = fir * (sec%1000-sec%100);

		System.out.println(thd);
		System.out.println(th4/10);
		System.out.println(th5/100);
		System.out.println(thd+th4+th5);

	}

}
