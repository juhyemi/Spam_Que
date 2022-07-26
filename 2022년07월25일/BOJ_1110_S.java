// 더하기 사이클
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int answer = N;
        while(true){
            int a = answer/10;
            int b = answer%10;
            int sum = (a+b)%10;
            answer = b*10 + sum;
            count++;

            if(answer == N){
                break;
            }
        }
        System.out.println(count);

    }
}
