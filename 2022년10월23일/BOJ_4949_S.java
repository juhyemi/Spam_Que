package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }

            if(!str.contains("(") && !str.contains(")") 
            && !str.contains("[") && !str.contains("]")){
                sb.append("yes").append("\n");
                continue;
            }

            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(int i=0; i<str.length(); i++){
                char chr = str.charAt(i);
                if(chr == '.') break;
                
                if(chr == '(' || chr == '['){
                    stack.add(chr);
                    continue;
                }

                if(chr == ')'){
                    if(stack.isEmpty()){
                        check = false;
                        break;
                    }else{
                        char last = stack.peek();
                        if(last == '('){
                            stack.pop();
                            continue;
                        }else{
                            check = false;
                            break;
                        }
                    }
                }

                else if(chr == ']'){
                    if(stack.isEmpty()){
                        check = false;
                        break;
                    }else{
                        char last = stack.peek();
                        if(last == '['){
                            stack.pop();
                            continue;
                        }else{
                            check = false;
                            break;
                        }
                    }     
                }
            }
            if(stack.isEmpty() && check){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
            
        }
        System.out.println(sb);
    }
}
