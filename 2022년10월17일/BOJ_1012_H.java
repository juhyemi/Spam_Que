import java.util.Scanner;

public class BOJ_1012_H {
    static int M;
    static int N;
    static int K;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 횟수
        int T = sc.nextInt();
        //T회 반복
        for (int i = 0; i < T; i++) {
            int count = 0;
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            // 배추밭 배열
            arr = new int[M+2][N+2];
            // 탐색 방문 배열
            visited = new boolean[M+2][N+2];
            for (int j = 0; j < K; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a+1][b+1] = 1;
            }
            for (int j = 1; j <= M; j++) {
                for (int k = 1; k <= N; k++) {
                    if (arr[j][k] == 1 && !visited[j][k]){
                        count++;
                        dfs(j,k);
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void dfs(int x, int y){
        visited[x][y] = true;
        if (arr[x+1][y] == 1 && !visited[x+1][y]) dfs(x+1,y);
        if (arr[x-1][y] == 1 && !visited[x-1][y]) dfs(x-1,y);
        if (arr[x][y+1] == 1 && !visited[x][y+1]) dfs(x,y+1);
        if (arr[x][y-1] == 1 && !visited[x][y-1]) dfs(x,y-1);
    }
}
