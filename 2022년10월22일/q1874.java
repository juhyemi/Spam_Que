package stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class q1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		boolean result = true;
		int n = Integer.parseInt(br.readLine()); //입력받을 정수의 개수
		int []a = new int [n]; //정수를 넣을 배열
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}//배열에 정수넣음
		
		int su = 1;
		for(int i=0; i<n; i++) {
			int k = a[i];
			if(k >= su) {
				while(k != su) {
					stack.push(su);
					su++;
					sb.append("+"+"\n");
				}
				}if(k==su) {
					stack.push(su);
					su++;
					sb.append("+" +"\n");
					stack.pop();
					sb.append("-"+"\n");
			}else if(stack.peek()==k) {
				stack.pop();
				sb.append("-" + "\n");
			}else if(stack.peek()<su) {
					System.out.println("NO");
					result = false;
					break;
			}

		} if(result) System.out.println(sb);
		
		
	}

}
