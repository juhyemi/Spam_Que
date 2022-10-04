import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ_10828_H {
    public static void main(String[] args) throws IOException {
        // Scanner 사용 시 시간초과 발생.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        // push 또한 readLine으로 입력 받아 숫자와 함께 저장한다.
        for (int i = 0; i < N ; i++) {
            list.add(br.readLine());
        }
        myStack(list);
    }
    public static void myStack(ArrayList<String> list){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            if (tmp.startsWith("push")){
                // push 뒤에 존재하는 숫자만 추출
                String[] arr = tmp.split(" ");
                stack.push(arr[1]);
            }
            else if (tmp.equals("pop")) {
                if (stack.empty()) System.out.println(-1);
                else System.out.println(stack.pop());
            }
            else if (tmp.equals("size")) System.out.println(stack.size());
            else if (tmp.equals("empty")) {
                if (stack.empty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (tmp.equals("top")){
                if (stack.empty()) System.out.println(-1);
                else System.out.println(stack.peek());
            }
        }
    }
}
