import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드
public class BOJ_10815_S {
	static int[] A;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		A = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(binary(a)) {
				sb.append(1).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb);
	}
	
	public static boolean binary(int a) {
 		boolean result = false;
		int start = 0; 
		int end = A.length-1;
		
		while(start <= end) {
			int idx = (start+end)/2;
			
			if(a == A[idx]) {
				result = true;
				break;
			}
			else if(a < A[idx]) {
				end = idx-1;
			}else if(a > A[idx]) {
				start = idx+1;
			}
		}
		return result;
	}
}
