import java.util.Scanner;

public class BOJ_20437_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String W = sc.next();
            int K = sc.nextInt();
            game(W,K);
        }
    }
    private static void game(String W, int K){
        int min = 10001;
        int max = -1;


        for (int i = 0; i < W.length(); i++) {
            if(K == 1) {
                min = 1;
                max = 1;
                break;
            }
            int count_x = 1;
            int count = 1;
            char x = W.charAt(i);
            for (int j = i + 1; j < W.length(); j++) {
                count++;
                if (W.charAt(j) == x){
                    count_x++;
                    if (count_x < K){
                        continue;
                    }
                    else if(count_x == K) {
                        if (count < min) {
                            min = count;
                        }
                        if (count > max) {
                            max = count;
                        }
                        break;
                    }
                }

            }
        }
        if (min == 10001 || max == -1){
            System.out.println(-1);
        }
        else {
            System.out.println(min + " " + max);
        }
    }
}
