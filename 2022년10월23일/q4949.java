package stage1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class q4949 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s;
			
			while((s=br.readLine())!= null) {
				check(s);
			}
			
		}
		
		public static void check(String s) {
			Stack<Character> stack = new Stack<>();

			String answer = "yes";
			if(s.charAt(0)=='.') {
				
			}
			else {			
				for(int i =0; i < s.length(); i++) {
					char a = s.charAt(i);
				
					if(a=='('||a=='[') {
						stack.push(a);					
					}
					else if(a==')') {
						if(stack.isEmpty() || stack.pop()!='(') {
							answer = "no";
						}
					}
					else if(a==']') {
						if(stack.isEmpty() || stack.pop()!='[') {
							answer = "no";
						}
					}
				
				}
				if(!stack.isEmpty()) {
					answer = "no";
				}
				System.out.println(answer);
			}
			
			
		}
	
}