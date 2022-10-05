//10845. 큐
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_10845_H {
    public static void main(String[] args) throws IOException {
        // Scanner 사용 시 시간초과 발생.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        // push 또한 readLine으로 입력 받아 숫자와 함께 저장한다.
        for (int i = 0; i < N ; i++) {
            list.add(br.readLine());
        }
        myQueue(list);
    }
    // Stack과 동일하게 자바의 내장 Queue클래스 이용.
    public static void myQueue(ArrayList<String> list){
        Queue<String> queue = new LinkedList<>();
        // last 변수를 만들어 마지막에 큐에 삽입된 값 저장 후 back()에서 사용.
        String last = "";
        for (int i = 0; i < list.size(); i++) {
            String tmp = list.get(i);
            if (tmp.startsWith("push")){
                // push 뒤에 존재하는 숫자만 추출
                String[] arr = tmp.split(" ");
                last = arr[1];
                queue.offer(last);
            }
            else if (tmp.equals("pop")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
            }
            else if (tmp.equals("size")) System.out.println(queue.size());
            else if (tmp.equals("empty")) {
                if (queue.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if (tmp.equals("front")){
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
            }
            else if (tmp.equals("back")){
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(last);
            }
        }
    }
}
