// DNA
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1969_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // DNA 수
        int N = Integer.parseInt(st.nextToken());
        // 문자열 길이
        int M = Integer.parseInt(st.nextToken());

        String[] dnaList = new String[N];

        // DNA 문자열 배열에 저장
        for(int i=0; i<N; i++){
            dnaList[i] = br.readLine();
        }
        
        HashMap<Character, Integer> map;
        char chr;
        int maxNum;
        char HDChar;
        String s = "";
        int sum = 0;

        // 문자열 길이만큼 반복
        for(int i=0; i<M; i++){
            map = new HashMap<>();
            maxNum = 0;
            HDChar = 'A';
            
            for(int j=0; j<N; j++){
                chr = dnaList[j].charAt(i);
                if(!map.containsKey(chr)) map.put(chr, 1);    
                
                else{
                    map.replace(chr, map.get(chr)+1);
                }

                if(map.get(chr) > maxNum || (map.get(chr) == maxNum && chr <= HDChar)){
                    maxNum = map.get(chr);
                    HDChar = chr;
                }
            }

            s += Character.toString(HDChar);
            sum += N - maxNum;
        }

        System.out.println(s);
        System.out.println(sum);
    }
}
