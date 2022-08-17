import java.util.Scanner;

public class BOJ_15721_H {
    // 구하고자 하는 번째 T를 활용하여 total_step을 구하고 이를 A로 나눠 해결.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int T = sc.nextInt();
        int word = sc.nextInt();
        int sum = 0;
        //몇 번째 바퀴인지.
        int round = 0;
        // round 내에서 몇 번째 뻔 또는 데기인지.
        int step = 0;
        for (int i = 1; i <= T; i++) {
            int a = 3+i;
            sum += a;
            // 몇번째 바퀴인지 확인.
            if (sum >= T){
                round = i-1;
                step = T-(sum-a)-1;
                break;
            }
        }
        //등차수열의 합 활용
        int total_step = (round*(8+(8+2*(round-1))))/2;
        if (word == 0){
            if (step == 0){
            }
            else if (step == 1){
                total_step +=2;
            }
            else {
                // BDBD가 나온 뒤 바로 연속되는 B가 나오기 때문.
                total_step += 4+step-2;
            }
        }
        else {
            if (step == 0){
                total_step+=1;
            }
            else if (step == 1){
                total_step+=3;
            }
            else {
                // BDBD이후 나오는 B의 행렬 이후로 D가 나타나기 때문.
                total_step+=6+round+step-2;
            }
        }
        System.out.println(total_step%A);
    }
}
