import java.util.Scanner;
public class BOJ_1018_H {
    static boolean[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            // 편의를 위해 B와W를 true,false로 바꿔준다.
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        int minimum = find(0,0);
        // find함수를 통해 나온 값 중 가장 작은 값을 찾는 과정
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                int tmp = find(i,j);
                if (tmp < minimum){
                    minimum = tmp;
                }
            }
        }
        System.out.println(minimum);
    }
    private static int find(int x, int y){
        int count_1 = 0;
        int count_2 = 0;
        // 첫 시작 boolen값을 기준으로 삼는다.
        boolean TF = arr[x][0];
        for (int i = x; i < x+8; i++) {
            for (int j = y; j < y+8; j++) {
                // 2가지 케이스를 모두 제공한다. B로 시작할 때와 W로 시작할 때.
                if (arr[i][j] != TF){
                    count_1+=1;
                }
                if (arr[i][j] == TF){
                    count_2+=1;
                }
                // 행이 바뀔 때 TF값이 변화해서는 안된다.
                if (j != y+7){
                    TF = !TF;
                }

            }
        }
        // 둘 중 작은값 채택.
        return Math.min(count_1,count_2);
    }
}
