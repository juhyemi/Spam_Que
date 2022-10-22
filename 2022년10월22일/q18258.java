package stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q18258 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Queue<String> queue = new LinkedList<>();
		
		String a = "a";
		int n = Integer.parseInt(br.readLine());
		for(int i=1; i<=n; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);

			if(st.nextToken().equals("push")) {

				a = st.nextToken();
				queue.add(a);				
			}else if(s.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1+"\n");
				}else{
					sb.append(queue.poll()+"\n");
				}
			
				
			}else if(s.equals("size")) {
				sb.append(queue.size()+"\n");
			}else if(s.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1+"\n");
				}else {
					sb.append(0 +"\n");
				}
			}else if(s.equals("front")){
				if(queue.isEmpty()) {
					sb.append("-1"+"\n");
				}else {
					sb.append(queue.peek()+"\n");
				}
			}else if(s.equals("back")) {
				if(queue.isEmpty()) {
					sb.append(-1+"\n");
				}else {
					sb.append(a +"\n");
				}
			}
			
			
		} System.out.println(sb);

		
	}

}
