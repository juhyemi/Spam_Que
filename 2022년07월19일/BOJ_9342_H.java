import java.util.Scanner;

public class BOJ_9342_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] arr = new String[T];
        // 그냥 정규식 쓰자...
        String pattern = "^[A-F]?A+F+C+[A-F]?$";
        for (int i = 0; i < T; i++) {
            arr[i] = sc.next();
            if (arr[i].matches(pattern)){
                System.out.println("Infected!");
            }
            else {
                System.out.println("Good");
            }
        }
    }
}

// 가정문으로 풀어보려했는데 안되겠네요...
//    private static void check(String str){
//        char[] str_arr = str.toCharArray();
//        String start = "BCDEF";
//        for (int i = 0; i < str_arr.length; i++) {
//            String x = String.valueOf(str_arr[i]);
//            if (i == 0){
//                if (start.contains(x)){
//                    if ("A".equals(str_arr[1])){
//                        continue;
//                    }
//                    else {
//                        System.out.println("GOOD");
//                        break;
//                    }
//                }
//            }
//        }
//    }