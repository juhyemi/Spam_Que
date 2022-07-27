// 최소공배수
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int answer = 0;

        while(T-- > 0){
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            answer = a*b/gcd(a, b);

            sb.append(answer).append("\n");
        }

        System.out.println(sb);   
    }

    // 최대공약수를 구하는 함수
    public static int gcd(int a, int b){
        if(b == 0) return a;
        
        return gcd(b, a%b);   
    }
    
}
