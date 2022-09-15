// 다트게임
package Programmers;

public class PG_2018_kakao_dartsGame_S{
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";
        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;

        int[] point = new int[3];
        int[] bonus = new int[3];
        int[] option = {1, 1, 1};

        int idx = -1;

        for(int i=0; i<dartResult.length(); i++){
            char chr = dartResult.charAt(i);

            // 점수일 경우
            if(chr >= '0' && chr <= '9'){
                idx++;
                
                // 10일 경우
                if(i != dartResult.length()-1){
                    if(chr == '1' && dartResult.charAt(i+1) == '0'){
                        i++;
                        point[idx] = 10;
                    }else{
                        point[idx] = chr-'0';
                    }
                    continue;
                }   
            }

            // 보너스일 경우
            if(chr == 'S') bonus[idx] = 1;
            if(chr == 'D') bonus[idx] = 2;
            if(chr == 'T') bonus[idx] = 3;

            // 옵션일 경우
            if(chr == '*') {
                if(idx == 0) option[idx] = 2;
                if(idx > 0) {
                    option[idx-1] = option[idx-1] * 2;
                    option[idx] = 2;
                }
            }
            if(chr == '#') option[idx] = -1;
        }

        for(int i=0; i<3; i++){
            answer += (int)Math.pow(point[i], bonus[i]) * option[i];
        }

        return answer;
    }

    
}