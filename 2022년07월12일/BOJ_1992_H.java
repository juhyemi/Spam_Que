import java.util.Scanner;

public class BOJ_1992_H {
    static int[][] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];
        for(int i = 0; i < N; i++) {
            String str = sc.next();
            // 입력이 배열이 아닌 String의 형태임으로 배열로 전환
            for(int j = 0; j < N; j++) {
                // 숫자 아스키코드를 0의 아스키코드에서 빼면 본래 int 형태로 돌아옴
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        quad_Tree(0,0,N);
        System.out.println(sb);
    }
    
    //배열의 특정 공간이 같은 숫자로 채워 있는지 확인하는 함수
    private static boolean check_BW(int row, int column, int N){
        boolean answer = true;
        int num = arr[row][column];
        for (int i = row; i < row + N; i++) {
            for (int j = column; j < column + N; j++) {
                if (arr[i][j] != num){
                    answer = false;
                }
            }
        }
        return answer;
        
    }
    private static void quad_Tree(int row, int column, int N){
        // 재귀 탈출조건 - 나눈 공간의 모든 숫자가 똑같은 경우
        if (check_BW(row, column, N) == true){
            sb.append(arr[row][column]);
        }
        else {
            // 시작 point를 기점으로 상하좌우를 나눠 재귀
            sb.append('(');
            quad_Tree(row,column,N/2);
            quad_Tree(row,column+N/2,N/2);
            quad_Tree(row+N/2,column,N/2);
            quad_Tree(row+N/2,column+N/2,N/2);
            sb.append(')');
        }
    }
}

// 첫 구상
// 탈출문이 반복분 내부에 있어 문제와는 맞지 않는 재귀가 발생함.
//    private static void quad_Tree(int row, int column, int N){
//        System.out.print("(");
//        for (int i = row; i < row+N; i+=N/2) {
//            for (int j = column; j< column+N; j+=N/2) {
//                if (check_BW(i, j, N/2) == true){
//                    System.out.print(arr[i][j]);
//                }
//                else {
//                    quad_Tree(i,j,N/2);
//                }
//            }
//        }
//        System.out.print(")");
//
//
//    }
