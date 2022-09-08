import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2503_H {
    static int N;
    static String[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new String[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.next();
            }
        }
        baseball();
    }
    private static void baseball(){
        int count = 0;
        // 각각의 수를 하나씩 사용 가능한 점을 조심하자.
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j ==i) continue;
                for (int k = 1; k < 10; k++) {
                    if (k ==i || k == j) continue;
                    int num = i*100 + j*10 + k;
                    if (check(String.valueOf(num))){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    private static boolean check(String num){

        boolean answer = true;
        for (int i = 0; i < N; i++) {
            String tmp = arr[i][0];
            int strike = Integer.parseInt(arr[i][1]);
            int ball = Integer.parseInt(arr[i][2]);
            int strike_count = 0;
            int ball_count = 0;
            for (int j = 0; j < 3; j++) {
                if (tmp.charAt(j) == num.charAt(j)){
                    strike_count++;
                }
                else {
                    if (tmp.contains(String.valueOf(num.charAt(j)))){
                        ball_count++;
                    }
                }
            }
            if (strike != strike_count || ball != ball_count){
                answer = false;
            }
        }
        return answer;
    }
}
