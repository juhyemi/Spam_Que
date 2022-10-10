import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Helicopter {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1;
        StringTokenizer st2;
        StringBuilder sb = new StringBuilder();

        int T = 3;
        
        // 성공인 경우 1, 실패인 경우 0 출력
        for(int i=1; i<=T; i++){
            st1 = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(br.readLine());
    
            int Cx = Integer.parseInt(st1.nextToken());
            int Cy = Integer.parseInt(st1.nextToken());
            int R = Integer.parseInt(st1.nextToken());
    
            int Sx = Integer.parseInt(st2.nextToken());
            int Sy = Integer.parseInt(st2.nextToken());
    
            int w = Cx - Sx;
            int h = Cy - Sy;
            
            if(Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2)) <= R){
                sb.append("#" + i + " " + 1).append("\n");
            }else{
                sb.append("#" + i + " " + 0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
