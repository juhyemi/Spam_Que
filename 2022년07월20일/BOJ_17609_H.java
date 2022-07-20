import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17609_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            palinDrome(arr[i]);
        }
    }

    private static void palinDrome(String str) {
        int answer = 0;
        int l_idx = 0;
        int r_idx = str.length() - 1;
        while (l_idx <= r_idx) {
            if (str.charAt(l_idx) != str.charAt(r_idx)) {
                answer++;
                if (str.charAt(l_idx + 1) == str.charAt(r_idx)) {
                    int l = l_idx + 1;
                    int r = r_idx;
                    while (l <= r) {
                        if (str.charAt(l) == str.charAt(r)) {
                            if (r-l <= 1){
                                l_idx++;
                            }
                            l++;
                            r--;
                        } else {
                            break;
                        }
                    }
                }

                if (str.charAt(l_idx) == str.charAt(r_idx - 1)) {
                    int l = l_idx;
                    int r = r_idx - 1;
                    while (l <= r) {
                        if (str.charAt(l) == str.charAt(r)) {
                            if (r-l <= 1){
                                r_idx--;
                            }
                            l++;
                            r--;
                        } else {
                            break;
                        }
                    }
                }
                if (answer >= 2){
                    break;
                }
            }
                else {
                    l_idx++;
                    r_idx--;
            }
        }
        if (answer >= 2) {
            System.out.println(2);
        } else {
            System.out.println(answer);
        }
    }
}




//시간초과
//    private static void palinDrome(String str){
//        if (str.equals(reverse(str))){
//            System.out.println(0);
//            return;
//        }
//        else{
//            for (int i = 0; i < str.length(); i++) {
//                StringBuilder str_sb = new StringBuilder(str);
//                StringBuilder tmp = new StringBuilder(str_sb);
//                tmp = tmp.deleteCharAt(i);
//                if (String.valueOf(tmp).equals(reverse(String.valueOf(tmp)))){
//                    System.out.println(1);
//                    return;
//                }
//            }
//            System.out.println(2);
//            return;
//        }
//    }
//    private static String reverse(String str){
//        StringBuilder sb = new StringBuilder();
//        sb.append(str);
//        String rev = String.valueOf(sb.reverse());
//        return rev;
//    }
