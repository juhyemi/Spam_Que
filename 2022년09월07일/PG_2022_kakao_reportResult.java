
package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PG_2022_kakao_reportResult {
    public static void main(String[] args) {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        System.out.println(Arrays.toString(solution(id_list, report, k)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));

        String[] reportSet = hashSet.toArray(new String[0]);

        String[][] reportTable = new String[report.length][2];

        // 유저ID와 유저가 신고한 ID를 배열에 저장
        for(int i=0; i<reportSet.length; i++){
            String[] str = reportSet[i].split(" ");
            
            reportTable[i][0] = str[0];
            reportTable[i][1] = str[1];
        }

        // 정지된 ID 리스트
        ArrayList<String> stopID = new ArrayList<>();

        // 유저별 신고당한 횟수를 저장할 맵
        HashMap<String, Integer> reportMap = new HashMap<>();

        // 신고당한 횟수 구하기
        for(int i=0; i<reportSet.length; i++){
            String key = reportTable[i][1];

            if(!reportMap.containsKey(key)){
                reportMap.put(key, 1);
            }else{
                reportMap.replace(key, reportMap.get(key)+1);
            }

            // 정지된 ID
            if(reportMap.get(key) >= k){
                stopID.add(key);
            }
        }

        // 유저가 신고한 ID 리스트
        int cnt;
        for(int i=0; i<id_list.length; i++){
            cnt = 0;
            for(int j=0; j<reportTable.length; j++){
                if(id_list[i].equals(reportTable[j][0])){
                    if(stopID.contains(reportTable[j][1])){
                        cnt++;
                    }
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }
    
}
