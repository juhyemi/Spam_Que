import java.util.*;
import java.util.stream.Stream;

public class KAKAO_Chache_H {
    public static void main(String[] args) {
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
        System.out.println(solution(3,cities));

    }
    public static int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0){
            return cities.length*5;
        }
        Stream<String> new_cities = Stream.of(cities);
        String[] new_arr = new_cities.map(String::toLowerCase).toArray(String[]::new);
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < cities.length; i++) {
            if (i<cacheSize){
                if (queue.contains(new_arr[i])){
                    answer+=1;
                    queue.offer(new_arr[i]);
                }
                else {
                    answer+=5;
                    queue.offer(new_arr[i]);
                }
            }
            else {
                if (queue.contains(new_arr[i])){
                    answer+=1;
                    queue.remove(new_arr[i]);
                    queue.offer(new_arr[i]);
                }
                else {
                    answer+=5;
                    queue.remove();
                    queue.offer(new_arr[i]);
                }
            }
        }
        return answer;
    }
}
