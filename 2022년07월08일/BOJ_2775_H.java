import java.util.Scanner;

public class BOJ_2775_H {
    // 아파트 사람 수가 담긴 배열
    private static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i = 0;i<total;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 배열은 언제나 넉넉하게
            arr = new int[a+1][b+1];
            for (int j = 0; j <= a; j++) {
                for (int k = 0; k < b; k++) {
                    int sum = 0;
                    // 0층 사람들 배정
                    if(j==0){
                        arr[j][k] = k+1;
                    }
                    // 1층 이상 사람들 배정
                    else {
                        // for문을 통해 j-1층의 k호 사람들의 합을 sum변수에 저장
                        for (int l = 0; l <= k; l++) {
                            sum += arr[j-1][l];
                        }
                        arr[j][k] = sum;
                    }
                }
            }
            System.out.println(arr[a][b-1]);
        }
    }
}