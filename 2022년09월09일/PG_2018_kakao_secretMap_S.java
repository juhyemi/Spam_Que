// 비밀지도
package Programmers;

import java.util.Arrays;

// 벽 1, 공백 0
public class PG_2018_kakao_secretMap_S {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] answer = solution(n, arr1, arr2);

        System.out.println(Arrays.toString(answer));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] str1 = new String[n];
        String[] str2 = new String[n];

        for(int i=0; i<n; i++){
            str1[i] = binaryNum(arr1[i], n);
            str2[i] = binaryNum(arr2[i], n);

            answer[i] = decoding(str1[i], str2[i]);
        }

        return answer;
    }

    public static String binaryNum(int n, int len){
        String bNum = "";
        while(n >= 1){
            bNum = n%2 + bNum;
            n = n/2;
        }

        if(bNum.length() < len){
            int dif = len - bNum.length();
            for(int i=0; i<dif; i++){
                bNum = "0" + bNum;
            }
        }

        return bNum;
    }

    public static String decoding(String str1, String str2){
        String result = "";

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == '1' || str2.charAt(i) == '1'){
                result += "#";
            }else{
                result += " ";
            }
        }

        return result;
    }

}
