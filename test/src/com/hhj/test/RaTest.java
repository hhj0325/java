package com.hhj.test;

import java.util.Random;

public class RaTest {
	public static void main(String[] args){
		Random r = new Random(System.currentTimeMillis());	
		for(int i = 0 ;i < 20 ;i++){
			System.out.println("i"+i+"random"+r.nextInt());
		}
	}

}
