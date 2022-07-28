// 소수 찾기
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978_S {
    public static boolean[] prime;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        prime = new boolean[1001];
        getPrime();

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            if(!prime[Integer.parseInt(st.nextToken())]){
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void getPrime(){
        prime[0] = prime[1] = true;

        for(int i=2; i*i<prime.length; i++){
            if(!prime[i]){
                for(int j=i*i; j<prime.length; j+=i){
                    prime[j] = true;
                } 
            }
        }
    }
    
}
