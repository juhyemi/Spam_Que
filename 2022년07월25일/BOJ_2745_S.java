// 진법 변환
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;

        int len = N.length()-1;

        for(int i=0; i<N.length(); i++){
            int tmp = 0;
            if(N.charAt(i)-'A' >= 0){
                tmp = N.charAt(i) - 'A' + 10;
                result += tmp*(int) Math.pow(B, len);
                len--;
            }else{
                result += (N.charAt(i)-'0') * (int)Math.pow(B, len);
                len--;
            }
        }

        System.out.println(result);

    }
}
