import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_14425_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (list.contains(str)){
                answer++;
            }

        }
        System.out.println(answer);
    }
}
