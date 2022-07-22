package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class BOJ_20154_S {
    public static void main(String[] args) throws IOException{
        HashMap<String,Integer> alphaTableMap = new HashMap<String, Integer>(){{
            put("A", 3);
            put("B", 2);
            put("C",1);
            put("D",2);
            put("E",3);
            put("F",3);
            put("G",3);
            put("H",3);
            put("I",1);
            put("J",1);
            put("K",3);
            put("L",1);
            put("M",3);
            put("N",3);
            put("O",1);
            put("P",2);
            put("Q",2);
            put("R",2);
            put("S",1);
            put("T",2);
            put("U",1);
            put("V",1);
            put("W",2);
            put("X",2);
            put("Y",2);
            put("Z",1);            
        }};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int[] arr = new int[S.length()];

        for(int i=0; i<S.length(); i++){
            arr[i] = alphaTableMap.get(Character.toString(S.charAt(i)));
        }

        while(true){
            arr = sumNums(arr);
            if(arr.length == 1){
                break;
            }
        }

        if(arr[0]%2 != 0){
            System.out.println("I'm a winner!");
        }else{
            System.out.println("You're the winner?");
        }

    }

    public static int[] sumNums(int[] arr){
        int[] result;
        int idx = 0;

        if(arr.length%2 == 0){
            result = new int[arr.length/2];
            for(int i=0; i<result.length; i++){
                result[i] = (arr[idx] + arr[idx+1])%10;
                idx += 2;
            }
        }
        else{
            result = new int[arr.length/2+1];
            for(int i=0; i<result.length; i++){
                if(i == result.length-1){
                    result[i] = arr[arr.length-1];
                }else{
                    result[i] = (arr[idx] + arr[idx+1])%10;
                    idx += 2;
                } 
            }
        }

        return result; 
    }
}
