import java.util.Scanner;

public class BOJ_4948 {
    private static boolean[] arr = new boolean[247000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Erato();
        while (true){
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            else {
                Prime_num(num);
            }
        }
    }
    private static void Erato(){
        for (int i = 2; i <= 496; i++) {
            int j = 2;
            if(arr[i] == false){
                while (i*j <= 246912){
                    arr[i*j] = true;
                    j++;
                }
            }
            else {
                continue;
            }
        }
    }
    private static void Prime_num(int num){
        int answer = 0;
        for (int i = num+1; i <= num*2; i++) {
            if (arr[i] == false){
                answer+=1;
            }
        }
        System.out.println(answer);
    }
}
