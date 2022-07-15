import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_11650_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            // compare 인터페이스는 두 객체간의 비교 관계를 사용자가 정의한다.
            // a=1, b=2 일 때 a-b = -1 즉, a는 b보다 -1만큼 작다는 의미.
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });
        // 출력
        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}