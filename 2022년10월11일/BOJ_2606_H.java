import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_2606_H {
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N = 컴퓨터의 수
        int N = Integer.parseInt(br.readLine());
        // 직접 연결 되어있는 컴퓨터 쌍의 수
        int M = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        int[][]  arr = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            String[] tmp = br.readLine().split(" ");
            arr[Integer.parseInt(tmp[0])][Integer.parseInt(tmp[1])] = 1;
            arr[Integer.parseInt(tmp[1])][Integer.parseInt(tmp[0])] = 1;
        }
        dfs(1,arr);
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) count++;
        }
        // start는 제외 해줘야 함
        System.out.println(count-1);
    }
    public static void dfs(int start, int[][] arr){

        for (int i = 1; i < arr.length; i++) {
            visited[start] = true;
            if (arr[start][i] == 1){
                if (!visited[i]){
                    dfs(i,arr);
                }
            }
        }
    }
}
