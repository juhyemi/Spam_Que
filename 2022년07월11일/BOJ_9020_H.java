import java.util.Scanner;

public class BOJ_9020_H {
    private static boolean[] arr = new boolean[10001];
    public static void main(String[] args) {
        Erato();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            Goldbach(num);
        }
    }
    // 에라토스테네스의 체
    private static void Erato(){
        for (int i = 2; i <= 100; i++) {
            int j = 2;
            if(arr[i] == false){
                while (i*j <= 10000){
                    arr[i*j] = true;
                    j++;
                }
            }
            else {
                continue;
            }
        }
    }
    private static boolean Prime(int num){
        if (arr[num] == false){
            return true;
        }
        else {
            return false;
        }
    }
    private static void Goldbach(int num){
        // 두 소수의 차이가 가장 작은 것을 출력하는 조건 만족을 위해 i를 num/2에서 역으로 반복진행
        for (int i = num/2; i > 0; i--) {
            // i가 소수고, 해당 숫자에서 소수를 뺀 숫자도 소수면 출력
            if (Prime(i) == true){
                if (Prime(num - i) == true){
                    System.out.println(i+" "+(num-i));
                    break;
                }
            }
        }
    }
}
