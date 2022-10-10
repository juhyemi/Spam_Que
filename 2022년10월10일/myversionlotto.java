package stage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myversionlotto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> win = new ArrayList<>();
		win.add(7);
		win.add(37);
		win.add(38);
		win.add(39);
		win.add(40);
		win.add(44);
		int bonus = 18;
		//당첨번호 지정
		
		int n = sc.nextInt(); //몇 사람이 할지
		for(int i =1;i<=n;i++){ //첫번째 사람부터
			int money =0;//사람 당 누적금액 초기호ㅑㅏ
			int t = sc.nextInt(); //한 사람이 로또 몇 개 살지
			for(int j=1;j<=t;j++) {//첫번째 게임부터
				List<Integer> num = new ArrayList<>();//게임당 리스트
				int collect = 0;
				for(int k =1;k<=6;k++) {//게임 당 첫 로또번호 입력	
					int tmp = sc.nextInt();
					num.add(tmp);					
					if(win.contains(tmp)) {
						collect ++;			
					}
					
									
				}
				if(collect == 6) {
					money += 16_6143_9625;					
				}else if(collect == 5&&num.contains(bonus)) {
					money += 6078_4377;
				}else if(collect == 5) {
					money += 154_7926;
				}else if(collect == 4) {
					money += 50000;
				}else if(collect ==3) {
					money += 5000;
				}
				
				
				
			}System.out.println("#"+i+" "+money);
			
		}
		
		
	}

}
