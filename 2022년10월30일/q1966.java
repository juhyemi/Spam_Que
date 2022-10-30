package stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1966 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      StringTokenizer st1;
      StringBuilder sb = new StringBuilder();
     
      
      
      
      int t = Integer.parseInt(br.readLine());
      int n;
      int m;
         for(int i =0; i<t; i++) {
        	Queue <Integer> index = new LinkedList<>();
            Queue <Integer> prior = new LinkedList<>();
            String s = br.readLine();
            st = new StringTokenizer(s);
            n = Integer.parseInt(st.nextToken());//문서의 개수
            m = Integer.parseInt(st.nextToken());//찾는 인덱스
            String p = br.readLine();
            st1 = new StringTokenizer(p);
            for(int j=0; j<n; j++) {
               prior.add(Integer.parseInt(st1.nextToken()));//우선순위 들어있는 배열
               index.add(j); //인덱스 수열      
             }
            int count = 0;
            loop:
            while(!prior.isEmpty()) {

	            int k =9;
	            while(k>=1) {           
	               if(prior.contains(k)) { 
	                  while(prior.peek()!=k) {
	                     index.add(index.poll());
	                     prior.add(prior.poll());
	                  }
	                  if(prior.peek()==k) {
	                      count++;
	                      prior.poll();
	                      int idx = index.poll();
	                      if(idx==m) {
	                    	  break loop;
	                       }
	                   }
	                  
	               }else k--;
	                   
	            }
            }sb.append(count+"\n"); 
         }System.out.println(sb);
               
            
   

   }

}