import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_10866_H {
    public static void main(String[] args) throws IOException {
        // Scanner 사용 시 시간초과 발생.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        // push 또한 readLine으로 입력 받아 숫자와 함께 저장한다.
        for (int i = 0; i < N ; i++) {
            list.add(br.readLine());
        }
        deque(list);
    }
    public static void deque(ArrayList<String> list){
        Deque<String> deque = new LinkedList<>();
        String last = "";
        //내장 클래스 사용했습니다 ^^
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            if (tmp.startsWith("push_front")){
                // push 뒤에 존재하는 숫자만 추출
                String[] arr = tmp.split(" ");
                last = arr[1];
                deque.addFirst(last);
            }
            else if (tmp.startsWith("push_back")){
                // push 뒤에 존재하는 숫자만 추출
                String[] arr = tmp.split(" ");
                last = arr[1];
                deque.addLast(last);
            }
            else if (tmp.equals("pop_front")) {
                if (deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.removeFirst());
            }
            else if (tmp.equals("pop_back")) {
                if (deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.removeLast());
            }
            else if (tmp.equals("size")) System.out.println(deque.size());
            else if (tmp.equals("empty")) {
                if (deque.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (tmp.equals("front")){
                if (deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.peek());
            }
            else if (tmp.equals("back")){
                if (deque.isEmpty()) System.out.println(-1);
                else System.out.println(deque.peekLast());
            }
        }
    }
}
