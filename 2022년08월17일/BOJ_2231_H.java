import java.util.Scanner;

public class BOJ_2231_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            int check_num = check(i);
            if (check_num == N){
                System.out.println(i);
                break;
            }
            if (i == N){
                System.out.println(0);
            }
        }
    }
    private static int check(int a){
        int sum = a;
        while (a > 0){
            sum += a%10;
            a /= 10;
        }
        return sum;
    }
}
