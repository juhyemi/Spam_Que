import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class KAKAO_Tuple_H {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        solution(s)
    }
    public static int[] solution(String s) {
        s= s.replace("{","");
        s=s.replace("},","-");
        s=s.replace("}}","");
        String[] arr = s.split("-");
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String[] a = arr[i].split(",");
            for (int j = 0; j < a.length; j++) {
                if (!list.contains(a[j])){
                    list.add(a[j]);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }
}
