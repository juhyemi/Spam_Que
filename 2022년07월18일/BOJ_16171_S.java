// 나는 친구가 적다
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16171_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String K = br.readLine();

        S = S.replaceAll("[0-9]", "");

        if(S.contains(K)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
