import java.util.HashMap;
import java.util.Scanner;

public class KAKAO_DartGame_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dartResult = sc.next();
        dart(dartResult);
    }
    public static void dart(String dartResult){
        int sum = 0;
        int last = 0;
        int num = 0;
        int tmp = 0;
        String[] arr = dartResult.split("");
        HashMap<String,Integer> bonus = new HashMap<>();
        bonus.put("S",1);
        bonus.put("D",2);
        bonus.put("T",3);
        HashMap<String,Integer> option = new HashMap<>();
        option.put("*",2);
        option.put("#",-1);

        for (int i = 0; i < arr.length; i++) {
            if (!bonus.containsKey(arr[i])&&!option.containsKey(arr[i])){
                // 10점인 경우 i를 건너뛰어 i+1에 존재하는 0을 입력받지 못하도록 함.
                if (arr[i].equals("1") && arr[i+1].equals("0")){
                    tmp = 10;
                    i++;
                }
                else tmp = Integer.parseInt(arr[i]);
            }
            else if (bonus.containsKey(arr[i])){
                // last를 다음 점수가 결정되는 시점에 정의함으로, last에게 생길 수 있는 변동을 적용함.
                last = num;
                num = (int) Math.pow(tmp,bonus.get(arr[i]));
                sum += num;
            }
            else if (option.containsKey(arr[i])){
                if (arr[i].equals("#")){
                    sum += -2 * num;
                    // num이 곧 last가 됨으로 꼭 재정의 해주자.
                    num = - num;
                }
                else if (arr[i].equals("*")){
                    sum += num + last;
                    // '*'이 첫 기회에 맞은 경우 last에 2를 곱해주기 위해 미리 처리.
                    num = 2*num;
                }
            }
        }
        System.out.println(sum);
    }
}
