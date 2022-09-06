// 블랙잭
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2798_S {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] list = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int tmp = 0;
        int max = 0;

        // N-2 까지 순회
        for(int i=0; i<N-2; i++){
            // 첫번째 카드 다음부터 N-1 까지 순회
            for(int j=i+1; j<N-1; j++){
                // 두번째 카드 다음부터 N까지 순회
                for(int z=j+1; z<N; z++){

                    // 3개 숫자 카드의 합
                    tmp = list[i] + list[j] + list[z];

                    if(tmp > max && tmp <= M){
                        max = tmp;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
