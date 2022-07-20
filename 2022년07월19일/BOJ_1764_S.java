// 듣보잡
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_1764_S {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();

            // N-듣도 못한 사람, M-보도 못한 사람  
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 듣도 못한 사람을 set에 추가
            HashSet<String> nSet = new HashSet<>();
            for(int i=0; i<N; i++){
                nSet.add(br.readLine());
            }

            // 듣도 못한 사람 set에 존재하는 보도 못한 사람을 result에 추가
            ArrayList<String> result = new ArrayList<>();
            for(int i=0; i<M; i++){
                String tmp = br.readLine();
                if(nSet.contains(tmp)){
                    result.add(tmp);
                }
            }

            // 듣보잡 수
            sb.append(result.size()).append("\n");

            // 이름을 사전순으로 정렬
            Collections.sort(result);

            for(String s : result){
                sb.append(s).append("\n");
            }

            System.out.println(sb);
        }
}
