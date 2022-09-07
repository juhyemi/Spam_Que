import java.util.Scanner;

public class BOJ_1969_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M= sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i]= sc.next();
        }
        hammingD(arr,M);
    }
    private static void hammingD(String[] arr,int M){
        String answer = "";
        int distance = 0;
        String[] dna = {"A","C","G","T"};

        for (int i = 0; i < M; i++) {
            int[] check = new int[4];
            for (int j = 0; j < arr.length; j++) {
                String tmp= String.valueOf(arr[j].charAt(i));
                for (int k = 0; k < 4; k++) {
                    if (tmp.equals(dna[k])){
                        check[k]++;
                    }
                }
            }
            int max = 0;
            int location = 0;
            for (int j = 0; j < 4; j++) {
                if (check[j]>max){
                    max = check[j];
                    location = j;
                }
            }
            answer+=dna[location];
            distance += arr.length-max;
        }
        System.out.println(answer);
        System.out.println(distance);
    }

}
