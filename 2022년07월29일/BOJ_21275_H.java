import java.util.Scanner;

public class BOJ_21275_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int[] A_arr = new int[37];
        int[] B_arr = new int[37];
        // 2^63 이상은 impossible이다. 입력되는 A나 B의 각 자릿수는 2 이상임으로 length()로 처리하자.
        if (A.length() >= 63 || B.length() >= 63){
            System.out.println("Impossible");
            System.exit(0);
        }
        int x = check_digit(A);
        int y = check_digit(B);
        for (int i = 2; i <= 36; i++) {
            if (i>=x){
                A_arr[i] = convert(A,i);
            }
            if (i>=y){
                B_arr[i] = convert(B,i);
            }
        }
        int count = 0;
        int answer =0;
        int A_answer = 0 ;
        int B_answer = 0;
        for(int i = 2; i < A_arr.length ; i++) {
            for(int j = 2; j< B_arr.length; j++) {
                // 0이라면 N진법에서 나타낼 수 없는 수이다......
                if (A_arr[i] == 0 || B_arr[i] == 0){
                    continue;
                }
                if(A_arr[i] == B_arr[j]) {
                    answer = A_arr[i];
                    A_answer = i;
                    B_answer = j;
                    count++;
                }
            }
        }
        // 0 이면 Multiple이다.
        if (A.equals("0") && B.equals("0")){
            System.out.println("Multiple");
        }
        else if (count == 0){
            System.out.println("Impossible");
        }
        else if (count == 1){
            // 서로 같은 수 없다.
            if (A_answer == B_answer){
                System.out.println("Impossible");
            }
            else {
                System.out.println(answer+" "+A_answer+" "+B_answer);
            }

        }
        else {
            System.out.println("Multiple");
        }



    }
    private static int convert(String A, int c){
        int sum = 0;
        int digit = A.length()-1;
        for (int i = 0; i < A.length(); i++) {
            if (Character.isDigit(A.charAt(i))){
                sum += (A.charAt(i)-'0') * Math.pow(c,digit);
            }
            else {
                sum += (A.charAt(i)-'a'+10) * Math.pow(c,digit);
            }
            digit--;
        }
        return sum;
    }
    // 2진번에는 2가 들어갈 수는 없다...
    // 가장 큰 값을 찾아서 N진법의 N을 정의해주자!
    private static int check_digit(String A){
        int k =0;
        if (A.matches(".*[a-z].*")){
            char max = '0';
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i)>max){
                    max = A.charAt(i);
                }
            }
            k = max-'a'+10+1;
        }
        return k;
    }
}
