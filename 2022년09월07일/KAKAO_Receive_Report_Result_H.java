import java.util.Arrays;

public class KAKAO_Receive_Report_Result_H {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        solution(id_list,report,k);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int member = id_list.length;
        int[] answer = new int[member];
        int[] check = new int[member];
        int[][] report_arr = new int[member][member];
        for (int i = 0; i < report.length; i++) {
            // 신고 상황을 하나씩 배열로 생성 후 int배열인 report_arr로 변경.
            String[] list = report[i].split(" ");
            report_arr[Arrays.asList(id_list).indexOf(list[0])][Arrays.asList(id_list).indexOf(list[1])] = 1;
        }
        for (int i = 0; i < member; i++) {
            for (int j = 0; j < member; j++) {
                // 리포트를 돌면서 누적 신고 횟수를 확인.
                if (report_arr[i][j] == 1){
                    check[j]++;
                }
            }
        }
        for (int i = 0; i < member; i++) {
            // 신고 획수가 k가 넘으면 check
            if (check[i]>=k){
                check[i] = -1;
            }
        }
        for (int i = 0; i < member; i++) {
            for (int j = 0; j < member; j++) {
                // 자신이 신고한 사람이 check에 있으면 메일 발송
                if (report_arr[i][j] == 1 && check[j] == -1){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
