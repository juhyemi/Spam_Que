import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 스택
public class BOJ_10828_S {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			// push
			if(str.contains(" ")) {
				int tmp = Integer.parseInt(str.substring(5));
				list.add(tmp);
				continue;
			}
			
			// pop
			if(str.equals("pop")) {
				if(list.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(list.get(list.size()-1)).append("\n");
					list.remove(list.size()-1);					
				}
				continue;
			}
			
			// size
			if(str.equals("size")) {
				sb.append(list.size()).append("\n");
				continue;
			}

			// empty
			if(str.equals("empty")) {
				if(list.size() == 0) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				continue;
			}
			
			// top
			if(str.equals("top")) {
				if(list.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(list.get(list.size()-1)).append("\n");
				}
				continue;
			}
		}
		
		System.out.println(sb);
		
	}
}
