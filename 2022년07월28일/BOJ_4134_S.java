// 다음 소수
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4134_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            long n = Long.parseLong(br.readLine());

            for(long i=n; true; i++){
                if(isPrimeNum(i)){
                    sb.append(i).append("\n"); 
                    break;
                }
            }
        }

        System.out.println(sb);
    }

    public static boolean isPrimeNum(long n){
        if(n==0 || n==1) return false;

        for(long i=2; i*i<=n; i++){
            if(n%i == 0) return false;
        }

        return true;
    }
}
