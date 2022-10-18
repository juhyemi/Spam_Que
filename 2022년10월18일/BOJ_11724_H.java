import java.util.Scanner;

public class BOJ_11724_H {
    static boolean[] visited;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[N+1][N+1];
        visited = new boolean[N+1];
        int count = 0;
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (!visited[i] && arr[i][j] == 1){
                    count++;
                    visited[i] = true;
                    dfs(i);
                }
            }
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) count++;
        }
        System.out.println(count-1);
    }
    public static void dfs(int a){
        visited[a] = true;
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i] && arr[a][i] == 1){
                dfs(i);
            }
        }
    }
}
