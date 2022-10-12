import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_1620_H {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        //탐색 작업은 Hash가 O(1)의 속도로 가장 빠르다.
        HashMap<String,Integer> map = new HashMap<>();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            map.put(name,i+1);
            arr[i] = name;
        }
        for (int i = 0; i < M; i++) {
            String tmp = sc.nextLine();
            if (isNum(tmp)) System.out.println(arr[Integer.parseInt(tmp)-1]);
            else System.out.println(map.get(tmp));
        }
    }
    public static boolean isNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
