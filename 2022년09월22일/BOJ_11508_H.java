import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_11508_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 배열 내림차순 정렬.
        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (i%3 == 2) continue;
            answer+= arr[i];
        }
        System.out.println(answer);

    }
}