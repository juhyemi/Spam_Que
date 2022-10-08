import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CT_Lotto {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        List<Integer> winNums = new ArrayList<>();
        winNums.add(7);
        winNums.add(37);
        winNums.add(38);
        winNums.add(39);
        winNums.add(40);
        winNums.add(44);
        
        int bonusNum = 18;

        // 테스트 케이스
        int t = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=t; i++){
            // 게임수
            int n = Integer.parseInt(br.readLine());
            long money = 0;

            // 게임시작
            while(n-- > 0){
                // 맞춘 숫자 개수
                int cnt = 0;
                st = new StringTokenizer(br.readLine());

                List<Integer> gameNums = new ArrayList<>();
                for(int j=0; j<6; j++){
                    gameNums.add(Integer.parseInt(st.nextToken()));
                }

                for(int j=0; j<6; j++){
                    int tmp = gameNums.get(j);
                    if(winNums.contains(tmp)) cnt++;
                }

                if(cnt == 6){
                    money += 16_6143_9625;
                } else if(cnt == 5 && gameNums.contains(bonusNum)){
                    money += 6078_4377;
                } else if(cnt == 5){
                    money += 154_7926;
                } else if(cnt == 4){
                    money += 50000;
                } else if(cnt == 3){
                    money += 5000;
                }
            }
            sb.append("#").append(i).append(" ").append(money).append("\n");
        }
       System.out.println(sb);
    }
}
