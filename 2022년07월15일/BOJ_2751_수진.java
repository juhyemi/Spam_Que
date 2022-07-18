// 수 정렬하기2
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2751_수진 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 배열의 길이를 1000001으로 했더니 오류가 난다.. 왜지?
        boolean[] arr = new boolean[2000001];

        for(int i=0; i<N; i++){
            arr[Integer.parseInt(br.readLine())+1000000] = true;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]){
                sb.append(i-1000000).append("\n");
            }
        }

        System.out.println(sb);


        // // Arrays.sort를 사용한 방법
        // // 통과는 하지만 시간이 오래걸림

        // int[] nList = new int[N];
        // for(int i=0; i<N; i++){
        //     nList[i] = Integer.parseInt(br.readLine());
        // }

        // Arrays.sort(nList);

        // for(int i : nList){
        //     sb.append(i).append("\n");
        // }

        // System.out.println(sb);
    }
}
