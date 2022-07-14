import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_H {
    public static void main(String[] args) {
        int[]  arr = new int[9];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        // 배열에 집어 넣으면서 sum에 더해준다.
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int point1 = 0;
        int point2 = 0;
        // 9명의 총 합에서 2명을 빼 100이 된다면 그 2명이 범인이다.
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - (arr[i] + arr[j]) == 100){
                    point1 = arr[i];
                    point2 = arr[j];
                    break;
                }
            }
        }
        // 정렬시킨다.
        Arrays.sort(arr);
        for (int i = 0; i < 9; i++) {
            // 나쁜 녀석들의 값은 건너뛰고 출력
            if (arr[i] == point1 || arr[i] == point2){
                continue;
            }
            else {
                System.out.println(arr[i]);
            }
        }
    }
}
