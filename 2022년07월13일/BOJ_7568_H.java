import java.util.Scanner;

public class BOJ_7568_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[][] arr = new int[total][3];
        for (int i = 0; i < total; i++) {
            int[] a = new int[2];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            arr[i] = a;
        }

        for (int j = 0; j < total; j++) {
            // 사람이 바뀔 때마다 count는 1로 초기화 
            int count = 1;
            for (int k = 0; k <total; k++) {
                // 본인은 비교에서 제외
                if(k == j){
                    continue;
                }
                // 두 조건을 모두 만족해야 count 증가
                else if(arr[j][0]<arr[k][0] && arr[j][1]<arr[k][1]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
