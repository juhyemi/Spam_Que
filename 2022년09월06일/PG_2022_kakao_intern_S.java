// 성격 유형 검사하기
package Programmers;

import java.util.HashMap;

public class PG_2022_kakao_intern_S {

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        System.out.println(solution(survey, choices));

    }


    public static String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        char chr = ' ';
        int point = 0;

        for(int i=0; i<choices.length; i++){
            if(choices[i] ==4) continue;

            // 1,2,3 답을 고를 경우, 첫번째 캐릭터에 비동의 관련 점수
            if(choices[i] < 4) {
                chr = survey[i].charAt(0);
                point = map.get(chr) + (3%choices[i]) + (3/choices[i]);
                map.replace(chr, point);
            }

            // 5,6,7 답을 고를 경우, 두번째 캐릭터에 동의 관련 점수
            if(choices[i] > 4) {
                chr = survey[i].charAt(1);
                point = map.get(chr) + choices[i] - 4;
                map.replace(chr, point);
            }
        }

        String answer = "";

        // 1번 지표
        int R = map.get('R');
        int T = map.get('T');
        if(R>=T){
            answer += "R";
        }else{
            answer += "T";
        }

        // 2번 지표
        int C = map.get('C');
        int F = map.get('F');
        if(C>=F){
            answer += "C";
        }else{
            answer += "F";
        }

        // 3번 지표
        int J = map.get('J');
        int M = map.get('M');
        if(J>=M){
            answer += "J";
        }else{
            answer += "M";
        }

        // 4번 지표
        int A = map.get('A');
        int N = map.get('N');
        if(A>=N){
            answer += "A";
        }else{
            answer += "N";
        }

        return answer;
    }
}

   
