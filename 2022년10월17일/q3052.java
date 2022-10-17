package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q3052 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
		ArrayList<Integer> v = new ArrayList<Integer>();
		for (int i = 0; i<10; i++) {
			int a = Integer.parseInt(bf.readLine());
			int b = a%42;
			if(!v.contains(b)) {
				v.add(b);
			}
		}
		System.out.println(v.size());
		
	
	}

}
