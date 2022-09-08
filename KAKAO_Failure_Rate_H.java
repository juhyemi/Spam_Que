import java.util.*;

public class KAKAO_Failure_Rate_H {
    public static void main(String[] args) {
        int N = 3;
        int[] stages = {1,1,1};
        solution(N,stages);
    }
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double>  map = new HashMap<>();
        double total= stages.length;
        // 레벨에 도달하지 못한 사람은 visites 배열에 추가 후 검색에서 건너뛰기.
        boolean[] visited = new boolean[stages.length];
        for (int i = 1; i <=N; i++) {
            double count = 0;
            for (int j = 0; j < stages.length; j++) {
                if (!visited[j]){
                    if (stages[j] <= i){
                        count++;
                        visited[j] = true;
                    }
                }
            }
            // 스테이지에 도달한 유저가 없으면 실패율을 0으로 설정해야 함.
            if (total == 0){
                map.put(i,(double)0);
            }
            else {
                map.put(i, count/total);
                total -= count;
            }
        }
        // value를 기준으로 내림차순 정렬 후 배열에 추가
        List<Integer> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet, (value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        for(int i = 0; i < listKeySet.size(); i++) {
            answer[i]= listKeySet.get(i);
        }
        return answer;
    }
}
