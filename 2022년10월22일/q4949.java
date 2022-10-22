package stage1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class q4949 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();

			loop:
			for(int i =1; i<=8; i++) {
				Stack<Character> stack = new Stack<>();
				String s = br.readLine();
				s.toCharArray();
				if(s.charAt(0)==' ') { //문자열 처음에 공백 받으면 pass
					break;
				}
				
				for(int j=0; j<s.length(); j++) {
				
					char a = s.charAt(j);
				
					if(a == '('|| a=='[') { //시작하는 괄호는 일단 스택에 넣어버림
						stack.push(a);
					}else if(a==')') { // 닫히는 괄호 나오면 조건문 시작
						if(stack.isEmpty()) { //닫히는 괄호가 있는데 시작하는 괄호 없으면 no
							sb.append("no"+"\n");
							break loop;
						}else if(stack.peek()!='(') { //스택에 시작하는 괄호 모양이 맞지 않으면 no
							sb.append("no"+"\n");
							break loop;
						}else if(stack.peek() == '(') { //스택 맨 위에 있는 괄호랑 모양이 맞으면 )랑 짝이 맞으면서 스택에 있는 값 빼주기
							stack.pop();
						}
					}else if(a == ']') { // 위에 ')'랑 같은 패턴
						if( stack.isEmpty()) {
							sb.append("no" + "\n");
							break loop;
						}else if(stack.peek() != '[') {
							sb.append("no" + "\n");
							break loop;
						}else if(stack.peek() == '[') {
							stack.pop();
						}
					}
					
				
				
				}if(stack.isEmpty()||s.charAt(0)=='.') { //한 줄 기준 반복문이 다 돌았을 때 스택에 값이 없으면 괄호가 다 맞는것이기 때문에 yes, 문장 처음에 .들어와도 균형 맞으니까 yes
					sb.append("yes" + "\n");
				}
			}System.out.println(sb);
			
			
				
				
				
			
		}

	}


