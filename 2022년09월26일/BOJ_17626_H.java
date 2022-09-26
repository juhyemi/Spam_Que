import java.util.Scanner;

public class BOJ_17626_H {
    public static void main(String[] args) {
        // 가장 근사값의 제곱근의 제곱을 빼준다고 문제가 풀리지 않는다......망했다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n);
        int arr[] = new int[n+1];
        arr[1] = 1;
        // 12에서 9를 이용해 Four Squares를 구하면 4가 나온다. 하지만 4를 이용한 3이 나와야 한다...
        // 배열을 채울 때 제곱값들을 모두 빼보며 확인 해보자.
        for (int i = 2; i <= n; i++) {
            int min = n;
            for (int j = 1; j*j <= i; j++) {
                int s = j*j;
                //제곱근을 뺀 arr[i-s]에 제곱근의 제곱만 더해주면 정답이 나온다.
                min = Math.min(arr[i-s],min);
                arr[i] = min+1;
            }
        }
        System.out.println(arr[n]);
    }
}
