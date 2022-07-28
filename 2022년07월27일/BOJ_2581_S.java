// 소수
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] prime = findPrime(N);

        int sum = 0;
        int min = -1;

        for(int i=M; i<=N; i++){
            if(!prime[i]){
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }else{
            for(int i=M; i<=N; i++){
                if(!prime[i]){
                    min = i;
                    break;
                }
            }

            System.out.println(sum);
            System.out.println(min);
        }
        
        
    }

    // 에라토스체
    public static boolean[] findPrime(int b){
        boolean[] prime = new boolean[b+1];

        prime[0] = prime[1] = true;

        for(int i=2; i*i<=b; i++){
            if(!prime[i]){
                for(int j=i*i; j<=b; j+=i){
                    prime[j] = true;
                }
            }
        }

        return prime;
    }
}

