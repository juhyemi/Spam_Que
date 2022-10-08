import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {
            check(arr[i]);
        }
    }
    public static void check(String str){
        // 정답은 디폴트 값으로 YES를 제공한다.
        String answer = "YES";
        // 여는 괄호를 삽입할 스택 생성
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character tmp = str.charAt(i);
            if (tmp.equals('(')) stack.add(tmp);
            // 닫는 괄호를 입력받을 시
            else {
                // 닫는 괄호에 상응하는 여는 괄호가 없을 경우 짝이 맞지 않음을 의미
                if (stack.size()==0) answer = "NO";
                // 스택 사이즈가 0이 아닌 경우 스택에서 pop
                else stack.pop();
            }
        }
        // 스택에 여는 괄호가 남아 있을 경우 NO
        if (stack.size() != 0) answer = "NO";
        System.out.println(answer);
    }
}
