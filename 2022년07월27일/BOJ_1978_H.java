import java.util.Scanner;

public class BOJ_1978_H {
    private static boolean[] arr = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        int[] num_arr = new int[N];
        int answer = 0;
        for (int i = 0; i < N; i++) {
            num_arr[i] = sc.nextInt();
            // 최대값을 찾는 이유 -> 반복되는 함수 낭비를 막기 위해
            if(num_arr[i] > max){
                max = num_arr[i];
            }
        }
        eratos(max);
        for (int i = 0; i < N; i++) {
            if (!arr[num_arr[i]]){
                answer++;
            }
        }
        System.out.println(answer);
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
