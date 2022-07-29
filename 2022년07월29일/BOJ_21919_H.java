import java.util.HashSet;
import java.util.Scanner;

public class BOJ_21919_H {
    private static boolean[] arr = new boolean[1000001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num_arr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            num_arr[i] = sc.nextInt();
            if (num_arr[i]>max){
                max = num_arr[i];
            }
        }
        // 소수들의 최소공배수는 서로의 곱과 동일하다!
        eratos(max);
        long answer = 1;
        // 문제에 언급이 되어있지는 않지만 중복을 처리해줘야 한다.
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            if (arr[num_arr[i]] == false){
                set.add(num_arr[i]);
            }
        }
        for (int number : set) {
            answer *= number;
        }
        if (answer == 1){
            System.out.println(-1);
        }
        else {
            System.out.println(answer);
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
