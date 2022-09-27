import java.util.Scanner;

public class BOJ_1010_H {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N+1][M+1];
            bridge(arr,N,M);
        }
    }
    public static void bridge(int[][] arr, int N, int M){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == 0) arr[i][j] = j+1;
                else if(j<i) arr[i][j] = 0;
                else if (j==i) arr[i][j] = 1;
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i][j-1];
                }
            }
        }
        System.out.println(arr[N-1][M-1]);
    }
}

