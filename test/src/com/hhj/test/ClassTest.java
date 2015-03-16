package com.hhj.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ClassTest {
	public String str = "";
	
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6};
		for(int i = 0 ; i < 6 ; i++){
			try{
				System.out.println("Hello Lisa");
				if(i == 3){
					System.out.println(a[9]);
				}
				else{
					System.out.println(a[i]);
				}
			}
			catch(Exception e){
				
			}
			
		}
		
	}

}
