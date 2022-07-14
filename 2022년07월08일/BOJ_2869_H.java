import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869_H {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int answer;
        // 한 번 도달하면 미끄러지지 않음.
        // 나눠 떨어지는 경우 V-A 높이까지 도달 한 뒤 1회 추가 후 종료
        if ((V - A) % (A - B) == 0){
            answer = (V - A) / (A - B)+1;
        }
        // 나눠 떨어지지 않는 경우 추가 1회 등반 후 몫의 나머지 만큼을 또 올라가야함.
        else {
            answer = (V - A) / (A - B)+2;
        }
        System.out.println(answer);
    }
}
