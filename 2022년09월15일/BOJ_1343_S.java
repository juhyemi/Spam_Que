// 폴리오미노
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1343_S{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String board = br.readLine();
        br.close();

        // .이 포함되지 않았을 경우
        if(!board.contains(".")){
            sb.append(greedy(board.length()));
        }
        // .이 포함된 경우
        else{ 
            for(int i=0; i<board.length(); i++){
                int cnt = 0;

                for(int j=i; j<board.length(); j++){
                    // .이 있는 지점을 찾으며 카운트
                    if(board.charAt(j) == '.') break;

                    cnt++;
                    i++;
                }

                if(greedy(cnt) == "-1"){
                    sb = new StringBuilder();
                    sb.append("-1");
                    break;
                }else{
                    sb.append(greedy(cnt));
                } 
                
                if(i < board.length()){
                    if(board.charAt(i) == '.'){
                        sb.append('.');
                    }
                }    
            }
        }
        
        System.out.println(sb);
    }

    public static String greedy(int cnt){
        String result = "";
        int aCnt = 0;
        int bCnt = 0;
        
        while(cnt>0){
            if(cnt%4 == 0){
                aCnt = cnt/4;
                break;
            }
            cnt -= 2;
            bCnt++;
        }

        if(cnt < 0){
            return "-1";
        }
        else{
            for(int i=0; i<aCnt; i++){
                result += "AAAA";
            }
            for(int i=0; i<bCnt; i++){
                result += "BB";
            }
            return result;
        }

    }
}