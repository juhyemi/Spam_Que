import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_1764_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        // Arraylist의 contains 시간 복잡도는 O(n) Hashset의 시간 복잡도는(1)이다.
        HashSet<String> arr = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.next());
        }
        for (int i = 0; i < M; i++) {
            String x = sc.next();
            if (arr.contains(x)){
                answer.add(x);
            }
        }
        answer.sort(Comparator.naturalOrder());
        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}
