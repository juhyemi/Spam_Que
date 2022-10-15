package stage1;

import java.util.Scanner;

public class q10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}//배열에 넣어버림
		int max=a[0];
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max = a[i];
			}else if(a[i]<min){
				min = a[i];
			}
		}
		System.out.println(min+" "+max);

	}

}