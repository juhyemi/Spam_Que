// 거스름돈
package Beakjoon;

// 2원, 5원짜리로만 거스름돈
// 최소 동전의 개수 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14916_S{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = -1;

        
        int fCnt = n/5;

        while(fCnt >= 0){
            int balance = n - fCnt*5;

            if(balance == 0){
                answer = fCnt;
                break;
            }else{
                if(balance%2 == 0){
                    answer = fCnt + balance/2;
                    break;
                }else{
                    fCnt--;
                }
            }
        }

        System.out.println(answer);
            
    }
}
