import java.util.Scanner;

public class BOJ_2798_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        black(arr,M);
    }
    private static void black(int[] arr, int M){
        int gap = M;
        int answer = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum<=M){
                        if (M-sum<gap){
                            gap = Math.abs(M-sum);
                            answer = sum;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}