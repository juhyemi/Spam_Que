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
        int cnt = 0;

        while(n > 0){
            if(n%5 == 0){
                cnt += n/5;
                break;
            }

            n -= 2;
            cnt++;
        }
        
        if(n < 0) System.out.println(-1);
        else System.out.println(cnt);
    }
}
