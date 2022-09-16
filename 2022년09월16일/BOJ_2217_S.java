// 로프
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.

public class BOJ_2217_S{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 로프의 개수
        int N = Integer.parseInt(br.readLine());

        // 각 로프를 저장할 배열
        int[] ropes = new int[N];

        // 각 로프가 버틸 수 있는 최대 중량
        for(int i=0; i<N; i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        // 로프의 길이를 오름차순으로 정렬
        Arrays.sort(ropes);
        
        int max = ropes[0] * N;

        for(int i=1; i<N; i++){
            int tmp = ropes[i] * (N-i); 
            if(tmp > max){
                max = tmp;
            }
        }

        System.out.println(max);
    }
}