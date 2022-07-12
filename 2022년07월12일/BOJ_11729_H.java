import java.util.Scanner;

public class BOJ_11729_H {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 반복 순서사 4회, 8회 증가한다는 점에서 2의 제곱이라 예상 후 확인
        System.out.println((int)Math.pow(2,num)-1);
        hanoi(num,1,3,2);
        System.out.println(sb);
    }
    private static void hanoi(int num, int start, int end, int rest){
        // 탈출 조건 - num이 1이 되면 sout후 재귀를 끝낸다.
        if (num == 1){
            sb.append(start+" "+end+"\n");
            return;
        }
        // 하노이의 탑 2층은 1층의 이동 2회로 이루어짐
        // 탑의 높이가 높아져도 같은 원리로 작동함.
        // so, 2층이 이동하는 순서를 N층에게도 동일하게 적용함.
        hanoi(num-1,start,rest,end);
        sb.append(start+" "+end+"\n");
        hanoi(num-1,rest,end,start);
    }
}
