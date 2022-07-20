// 염색체
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9342_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        // 문자열은 {A, B, C, D, E, F} 중 0개 또는 1개로 시작해야 한다.
        // 그 다음에는 A가 하나 또는 그 이상 있어야 한다.
        // 그 다음에는 F가 하나 또는 그 이상 있어야 한다.
        // 그 다음에는 C가 하나 또는 그 이상 있어야 한다.
        // 그 다음에는 {A, B, C, D, E, F} 중 0개 또는 1개가 있으며, 더 이상의 문자는 없어야 한다.
        String pattern = "^[A-F]?A+F+C+[A-F]?$";

        for(int i=0; i<T; i++){
            if(br.readLine().matches(pattern)){
                sb.append("Infected!").append("\n");
            }else{
                sb.append("Good").append("\n");
            }
        }

        System.out.println(sb);
        
    }
}
