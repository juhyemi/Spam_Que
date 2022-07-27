import java.util.Scanner;

public class BOJ_2960_H {
    private static boolean[] arr = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        eratos(N,K);
    }
    private static void eratos(int N, int K){
        int count = 0;
        if (K == 1){
            System.out.println(2);
            return;
        }
        arr[0] = arr[1] = true;
        // 기존 제곱근을 사용하던 에라토스테네스의 체와는 달리 모든 배열이 true가 될 때까지 반복하기 때문에
        // sqrt를 사용하지 않는다.
//        int nSqrt = (int)Math.sqrt(N);

        for (int i = 2; i <= N; i++) {
            int j = 1;
            while (i*j <= N){

                if (!arr[i*j]){
                    count++;
                    if (count == K){
                        System.out.println(i*j);
                        return;
                    }
                    arr[i*j] = true;
                    j++;
                }
                else {
                    j++;
                }
            }
        }
    }
}
