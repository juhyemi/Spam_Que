// 최대공약수와 최소공배수
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609_S {   
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 최대공약수
        System.out.println(gcd(a, b));

        // 최소공배수
        System.out.println(a*b / gcd(a, b));

    }

    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
