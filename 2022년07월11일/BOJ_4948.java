// 베르트랑 공준
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948 {
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            n = Integer.parseInt(br.readLine());
            
            // 0이 입력되면 반복문 종료
            if(n == 0){
                break;
            }            
         
            int cnt = 0;
            for(int i=n+1; i<=2*n; i++){
                if(checkIsPrimeNumber(i)){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
              
    }   

    // 소수인지 확인하는 함수
    static boolean checkIsPrimeNumber(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
