
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2217_H {
    static int[] arr;
    static boolean[] visited;
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        rope(N);
    }
    public static void rope(int N){
        Arrays.sort(arr);
        int max = 0;
        for (int i = 1; i <= N; i++) {
            if (i*arr[arr.length-i]>max){
                max = i*arr[arr.length-i];
            }
        }
        System.out.println(max);
    }
}
