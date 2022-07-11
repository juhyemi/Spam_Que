package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 달팽이는 올라가고 싶다..

// 높이가 V미터인 나무 막대에 올라간다
// 낮에는 A미터 올라간다
// 밤에는 B미터 미끌
// 정상에 올라가면 미끌x

// 나무 막대를 모두 올라가려면 며칠이 걸릴까?

// 첫째 줄에 A,B,V 
public class BOJ_2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 올라가는 거리
        int A = Integer.parseInt(st.nextToken());
        // 미끄러지는 거리
        int B = Integer.parseInt(st.nextToken());
        // 올라가야 하는 거리(나무막대)
        int V = Integer.parseInt(st.nextToken());

        // 나무 막대에 도달하면 미끄러지지 않는다.
        // 그러므로, 나무막대길이에서 미끄러지는 거리를 빼준 값에(V-B) 하루에 올라가는 거리(A-B)의 몫을 구한다.
        int day = (V-B)/(A-B);
        
        // 나머지가 0이라면 몫이 올라가는데 걸리는 시간이고,
        // 0이 아니라면 올라가는데 하루가 더 걸리므로 day+1을 해준다.
        if((V-B)%(A-B) != 0){
            day++;
        }
        
        System.out.println(day);
    }
}
