import java.util.Scanner;

public class BOJ_16171_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String K = sc.nextLine();
        char[] arr = S.toCharArray();
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])){
                continue;
            }
            else {
                str += arr[i];
            }
        }
        char[] str_arr = str.toCharArray();
        for (int i = 0; i <= str_arr.length-K.length(); i++) {
            String answer = new String();
            for (int j = i; j < i+K.length(); j++) {
                answer += str_arr[j];
            }
            if (answer.equals(K)){
                System.out.println(1);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
