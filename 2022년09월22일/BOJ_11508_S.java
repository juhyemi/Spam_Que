// 2+1 세일
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_11508_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> products = new ArrayList<>();

        for(int i=0; i<N; i++){
            products.add(Integer.parseInt(br.readLine()));
        }

        br.close();

        Collections.sort(products);
        Collections.reverse(products);

        int cost = 0;

        for(int i=1; i<=N; i++){
            if(i%3 == 0){
                continue;
            }else{
                cost += products.get(i-1);
            }
        }
    
        System.out.println(cost);

    }
}
