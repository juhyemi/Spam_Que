package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4659_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = "";

        while(true){
            word = br.readLine();

            if(word.equals("end")){
                break;
            }

            if(condition1(word)){
                if(condition2(word)){
                    if(condition3(word)){
                        sb.append("<"+word+"> is acceptable.").append("\n");
                    }else{
                        sb.append("<"+word+"> is not acceptable.").append("\n");
                    }
                }else{
                    sb.append("<"+word+"> is not acceptable.").append("\n");
                }
            }else{
                sb.append("<"+word+"> is not acceptable.").append("\n");
            }
        }

        System.out.println(sb);
    }

    // 1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
    public static boolean condition1(String word){
        if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")){
            return true;
        }else{
            return false;
        }
    }

    // 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
    public static boolean condition2(String word){
        if(word.length() < 3){
            return true;
        }

        for(int i=0; i<word.length()-2; i++){
            char word1 = word.charAt(i);
            char word2 = word.charAt(i+1);
            char word3 = word.charAt(i+2);
            
            if(word1=='a' || word1=='e' || word1=='i' || word1=='o' || word1=='u'){
                if(word2=='a' || word2=='e' || word2=='i' || word2=='o' || word2=='u'){
                    if(word3=='a' || word3=='e' || word3=='i' || word3=='o' || word3=='u'){
                        return false;
                    }
                }
            }

            if(word1!='a' && word1!='e' && word1!='i' && word1!='o' && word1!='u'){
                if(word2!='a' && word2!='e' && word2!='i' && word2!='o' && word2!='u'){
                    if(word3!='a' && word3!='e' && word3!='i' && word3!='o' && word3!='u'){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    // 3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
    public static boolean condition3(String word){
        if(word.length() < 2){
            return true;
        }

        for(int i=0; i<word.length()-1; i++){
           if(word.charAt(i) != 'e' && word.charAt(i) != 'o'){
               if(word.charAt(i) == word.charAt(i+1)){
                   return false;
               }
           }
        }

        return true;
    }
}
