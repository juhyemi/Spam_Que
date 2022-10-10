// 두 수의 합
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_3273_S{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int x = Integer.parseInt(br.readLine());
        br.close();

        int startIdx = 0;
        int endIdx = n-1;
        int cnt = 0;
        
        while(startIdx < endIdx){
            int sum = list.get(startIdx) + list.get(endIdx);

            if(sum == x) {
                cnt++;
                startIdx++;
                endIdx--;
            }else if(sum > x){
                endIdx--;
            }else if(sum < x){
                startIdx++;
            }
        }
        System.out.println(cnt);
    }
}