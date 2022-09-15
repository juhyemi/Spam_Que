import java.util.Scanner;

public class BOJ_1343_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        x = x.replaceAll("XXXX","AAAA");
        x = x.replaceAll("XX","BB");
        if (x.contains("X")) System.out.println(-1);
        else System.out.println(x);
    }
}
