package com.hhj.test.three;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" input some words ");
		String password = scanner.nextLine();
		char[] array = password.toCharArray();
		for(int i = 0 ; i < array.length ; i++){
			array[i] = (char)(array[i]^20000);
		}
		System.out.println(" output words ");
		System.out.println(new String(array));
		
		
	}

}
