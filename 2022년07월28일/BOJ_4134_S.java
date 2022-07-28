// 다음 소수
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_4134_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        
        while(T-- > 0){
            String num = br.readLine();
            BigInteger bi = new BigInteger(num);

            if(bi.isProbablePrime(10)){
                sb.append(num).append("\n");
            }else{
                sb.append(bi.nextProbablePrime()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
