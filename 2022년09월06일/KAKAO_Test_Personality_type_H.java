import java.util.Arrays;

public class KAKAO_Test_Personality_type_H {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey,choices));
    }
    public static String solution(String[] survey, int[] choices) {
        String string_answer = "";
        int[] answer = new int[8];
        String [] test_arr = {"R","T","C","F","J","M","A","N"};
        //for문을 돌면서 점수를 확인하고 3보다 아래의 경우 survey[i]의 첫번째 글자의 answer인덱스에 점수를 추가
        for (int i = 0; i < survey.length; i++) {
            if (choices[i]<=3){
                String check_type = String.valueOf(survey[i].charAt(0));
                answer[Arrays.asList(test_arr).indexOf(check_type)] += 4-choices[i];
            }
            else if (choices[i] == 4){
                continue;
            }
            else {
                String check_type = String.valueOf(survey[i].charAt(1));
                answer[Arrays.asList(test_arr).indexOf(check_type)] += choices[i]-4;
            }
        }
        for (int i = 0; i < 8; i+=2) {
            if (answer[i]>=answer[i+1]){
                string_answer += test_arr[i];
            }
            else {
                string_answer += test_arr[i+1];
            }
        }
        return string_answer;
    }
}
