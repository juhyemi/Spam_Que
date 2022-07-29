// 서로소 평균
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21920_S{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int X = Integer.parseInt(br.readLine());

        double cnt = 0;
        double sum = 0;

        // X와 서로소인 
        for(int i=0; i<N; i++){
            if(gcd(Math.max(X, A[i]), Math.min(X, A[i])) == 1){
                cnt++;
                sum += A[i];
            }
        }

        System.out.println(sum / cnt);
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}