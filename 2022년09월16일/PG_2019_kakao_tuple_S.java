// 튜플
package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PG_2019_kakao_tuple_S {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
    }

    public static ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();

        s = s.replace("{{", "");
        s = s.replace("}}", "");
        s = s.replace("},{", "-");

        String str[] = s.split("-");

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for(String x : str){
            String[] tmp = x.split(",");
            
            for(int i=0; i<tmp.length; i++){
                int n = Integer.parseInt(tmp[i]);

                if(!answer.contains(n)){
                    answer.add(n);
                }
            }
            
        }

        return answer;
    }
}
