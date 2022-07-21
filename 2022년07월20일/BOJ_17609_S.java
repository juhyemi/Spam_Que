// 회문
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 회문이면 0, 유사회문이면 1, 그 외는 2를 출력

public class BOJ_17609_S {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        String word = "";

        for(int i = 0; i<T; i++) {
            word = br.readLine();
            
            if(palindrome(word)){
                sb.append(0).append("\n");
            }
            else if(pseudo(word)){
                sb.append(1).append("\n");
            }
            else{
                sb.append(2).append("\n");
            }
        }
        System.out.println(sb);
    }

    // 회문인지 확인하는 함수
    public static boolean palindrome(String word){
        StringBuffer sbf = new StringBuffer(word);
        String reverse = sbf.reverse().toString();

        if(word.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }

    // 유사회문인지 확인하는 함수
    public static boolean pseudo(String word){
        StringBuffer sbf;
        String word1 = "";
        String word2 = "";

        int left = 0;
        int right = word.length()-1;

        while(left <= right){
            if(word.charAt(left) == word.charAt(right)){
                left++;
                right--;
            }else{
                break;
            }
        }

        sbf = new StringBuffer(word);
        word1 = sbf.deleteCharAt(left).toString();
        sbf = new StringBuffer(word);
        word2 = sbf.deleteCharAt(right).toString();

        if(!palindrome(word1) && !palindrome(word2)){
            return false;
        }
        else{
            return true;
        }   
    }
}
