// 평행
package programmers;

import java.util.ArrayList;
import java.util.List;

public class PG_parallel {
	public int solution(int[][] dots) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        double tmp1 = 0.0;
        double tmp2 = 0.0;
        
        for(int i=0; i<4; i++){
            int j = list.get(0);
            list.remove(0);
            
            tmp1 = incli(dots[0][0], dots[0][1], dots[j][0], dots[j][1]);
            tmp2 = incli(dots[list.get(0)][0], dots[list.get(0)][1], dots[list.get(1)][0], dots[list.get(1)][1]);
            
            if(tmp1 == tmp2) return 1;
            
            list.add(j);
        }
        return 0;
    }
    
    public static double incli(int x1, int y1, int x2, int y2){
        return (y2*1.0-y1) / (x2*1.0-x1);
    }
}
