// 실패율
package Programmers;
import java.util.Arrays;

// 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
// N : 전체 스테이지 개수
// stages : 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
// 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return

public class PG_2019_kakao_failureRate_S {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(N, stages)));
    }   

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Double[] rate_list = new Double[N];

        int player = stages.length;
        Double reach_player;
        Double not_clear_player;

        for(int i=1; i<=N; i++){
            // i 스테이지에 도달한 플레이어 수 초기화
            reach_player = 0.0;
            // i 스테이지에 도달했으나, 클리어하지 못한 플레이어 수 초기화
            not_clear_player = 0.0;

            for(int j=0; j<player; j++){
                // i번 스테이지에 있는 플레이어 수
                if(stages[j] >= i){
                    reach_player++;
                }
                if(stages[j] == i){
                    not_clear_player++;
                }
            }

            // 실패율
            Double failure_rate = not_clear_player / reach_player;
            rate_list[i-1] = failure_rate;
            answer[i-1] = i;
        }

        sort(rate_list, answer);

        return answer;
    }

    public static void sort(Double[] rate_list, int[] answer){
        for(int j=0; j<rate_list.length; j++){
            for(int i=rate_list.length-1; i>j; i--){
               if(rate_list[i] > rate_list[i-1]){
                    double_swap(rate_list, i, i-1);
                    int_swap(answer, i, i-1);
               }
            }
        }
    }

    public static void int_swap(int[] arr, int idx1, int idx2){
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp; 
    }

    public static void double_swap(Double[] arr, int idx1, int idx2){
        Double tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp; 
    }

}
