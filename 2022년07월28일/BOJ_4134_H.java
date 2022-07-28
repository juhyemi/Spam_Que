import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_4134_H {
    private static boolean[] arr = new boolean[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String number = sc.next();
            BigInteger bi = new BigInteger(number);
            // 소수인가?
            if (bi.isProbablePrime(10)){
                System.out.println(number);
            }
            else {
                // bi보다 큰 다음 소수를 return
                System.out.println(bi.nextProbablePrime());
            }
        }
    }
}
