// 문자열 집합
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_14425_수진 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // N-집합 S에 포함되어 있는 문자열, M-검사해야 하는 문자열
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // HashSet을 이용해 N개의 문자열로 이루어진 집합 S 만들기
        HashSet<String> S = new HashSet<String>();
        for(int i=0; i<N; i++){
            S.add(br.readLine());
        }

        // 입력받은 문자열이 집합 S에 있는 문자열일 경우 카운트
        int answer = 0; 
        for(int i=0; i<M; i++){
            if(S.contains(br.readLine())){
                answer++;
            }
        }

        System.out.println(answer);

    }
}