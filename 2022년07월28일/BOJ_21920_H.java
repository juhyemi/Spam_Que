import java.util.Scanner;

public class BOJ_21920_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double sum = 0;
        double count = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (gcd(arr[i],key)){
                sum += arr[i];
                count++;
            }
        }
        // 최대 오차가 정해져 있으니 꼭 double형으로 풀자
        double answer = sum/count;
        System.out.println(answer);
    }
    private static boolean gcd(int a, int b){
        // 나머지 또는 나눠지는 값이 1이라면 a,b의 최대공약수가 1이고 둘은 서로소이다.
        if (Math.min(a,b) == 1){
            return true;
        }
        if (a % b ==0){
            return false;
        }
        return gcd(b,a%b);
    }
}
