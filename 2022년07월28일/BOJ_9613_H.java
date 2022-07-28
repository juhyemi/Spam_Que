import java.util.Scanner;

public class BOJ_9613_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
    private static int gcd(int a, int b){
        if (a % b ==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
