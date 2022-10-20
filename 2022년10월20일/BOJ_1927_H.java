import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1927_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MinHeap minHeap = new MinHeap();
        minHeap.insert(0);
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(br.readLine());
            if (a == 0){
                long answer = minHeap.delete();
                System.out.println(answer);
            }
            else {
                minHeap.insert(a);
            }
        }
    }
    private static class MinHeap{
        ArrayList<Long> heap = new ArrayList<>();
        public void insert(long x){
            heap.add(x);
            for (int i = heap.size()-1; i > 1; i/=2) {
                if (heap.get(i) < heap.get(i / 2)){
                    change(i,i/2);
                }
            }
        }
        public long delete(){
            if (heap.size()<=1){
                return 0;
            }
            // 1로 설정하는 이유는 0으로 한다면 나머지를 통해 도달할 수 없기 때문.
            long min = heap.get(1);
            change(1,heap.size()-1);
            heap.remove(heap.size()-1);
            int parent = 1;
            while (true){
                int child = parent * 2;
                // child의 값 2개 중 무엇이 큰지 확인.
                if (child < heap.size() -1 && heap.get(child) > heap.get(child + 1)) child++;
                if (child >= heap.size() || heap.get(child) > heap.get(parent)) break;
                change(parent,child);
                parent = child;
            }
            return min;
        }
        public void change(int a, int b){
            long tmp = heap.get(a);
            heap.set(a, heap.get(b));
            heap.set(b,tmp);
        }
    }
}
