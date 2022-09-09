import java.util.HashSet;
import java.util.Scanner;

public class BOJ_5568_H {
    static int n;
    static int k;
    static String[] arr;
    static String[] tmp_arr;
    static boolean[] visited;
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new String[n];
        tmp_arr = new String[k];
        visited = new boolean[arr.length];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        selectCard(0);
        System.out.println(set.size());
    }
    private static void selectCard(int count){
        if (count == k){
            String answer = "";
            for (int i = 0; i < k; i++) {
                answer += tmp_arr[i];
            }
            set.add(Integer.valueOf(answer));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                tmp_arr[count] = arr[i];
                visited[i] = true;
                selectCard(count+1);
                visited[i] = false;
            }
        }
    }
}
