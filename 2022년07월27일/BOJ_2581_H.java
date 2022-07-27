import java.util.Scanner;

public class BOJ_2581_H {
    private static boolean[] arr = new boolean[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        eratos(N);
        boolean first = true;
        int min = 0;
        int sum = 0;
        for (int i = M; i <= N; i++) {
            if (!arr[i]){
                // 첫 번째 소수만 쏙 빼온다!
                if (first){
                    min = i;
                    first = false;
                }
                sum+=i;
            }
        }
        if (sum == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    private static void eratos(int N){
        arr[0] = arr[1] = true;
        int nSqrt = (int)Math.sqrt(N);
        for (int i = 2; i <= nSqrt; i++) {
            int j = 2;
            while (i*j <= N){
                if (!arr[i*j]){
                    arr[i*j] = true;
                    j++;
                }
                else {
                    j++;
                    continue;
                }
            }
        }
    }
}
