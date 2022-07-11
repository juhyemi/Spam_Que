// 부녀회장이 될테야 
package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2775{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 아파트 사는 사람의 수를 담을 배열
        int[][] APT = new int[15][15];

        for(int i=1; i<15; i++){
            APT[0][i] = i;
            APT[i][1] = 1;
        }    

        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());
        int k = 0;
        int n = 0;

        for(int i=0; i<T; i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());    
            bw.write(APT[k][n]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}