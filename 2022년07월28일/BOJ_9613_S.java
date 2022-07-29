// GCD 합
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9613_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    sum += gcd(Math.max(arr[i], arr[j]), Math.min(arr[i], arr[j]));
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
}
