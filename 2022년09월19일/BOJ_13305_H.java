import java.io.*;
import java.util.StringTokenizer;

public class BOJ_13305_H {
    static int N;
    static long[] length;
    static long[] price;
    public static void main(String[] args) throws IOException {
        // 이 정도 큰 수는 버퍼 리더가 필요하다나 뭐라나....
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.valueOf(br.readLine());

        length = new long[N - 1];
        price= new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            int distance = Integer.valueOf(st.nextToken());
            length[i] = distance;
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int fuel = Integer.valueOf(st.nextToken());
            price[i] = fuel;
        }
        // 그리디 문제의 대표격과도 같은 유도식이 나온다. 항상 유도식을 먼저 생각하고 코드를 작성하자.
        long total_cost = 0;
        long last = price[0];
        for (int i = 0; i < N-1; i++) {
            if (price[i] < last){
                total_cost += price[i]*length[i];
                last = price[i];
            }
            else {
                total_cost += last*length[i];
            }
        }
        System.out.println(total_cost);
    }
}
