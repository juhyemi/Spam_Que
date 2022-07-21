import java.util.Scanner;

public class BOJ_4659_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String col = "aeiou";
        boolean answer;
        while (true){
            answer = true;
            String str = sc.next();
            if (str.equals("end")){
                break;
            }
            boolean check_col = false;
            int x_count = 0;
            int y_count = 0;
            char before = ' ';
            for (int i = 0; i < str.length(); i++) {
                char x = str.charAt(i);
                if (col.contains(String.valueOf(x))){
                    check_col = true;
                    x_count++;
                    y_count = 0;
                    if (x_count>=3){
                        answer = false;
                        break;
                    }
                }
                if (!col.contains(String.valueOf(x))){
                    y_count++;
                    x_count = 0;
                    if (y_count>=3){
                        answer = false;
                        break;
                    }
                }
                if (x == before && x!='e'&& x!='o'){
                    answer = false;
                }
                before = x;
            }
            if (check_col == false){
                answer = false;
            }
            if (answer == true){
                System.out.println("<"+str+"> is acceptable.");
            }
            else {
                System.out.println("<"+str+"> is not acceptable.");
            }
        }
    }
}
