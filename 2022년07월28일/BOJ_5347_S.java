// LCM
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5347_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            st = new StringTokenizer(br.readLine());
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());

            long lcm = a*b / gcd(a, b);
            
            sb.append(lcm).append("\n");
        }

        System.out.println(sb);
    }

    public static long gcd(long a, long b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
