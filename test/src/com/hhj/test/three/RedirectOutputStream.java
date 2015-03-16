package com.hhj.test.three;

import java.io.PrintStream;

public class RedirectOutputStream {

	public static void main(String[] args) {
		try {
			PrintStream out = System.out;
			PrintStream pStream = new PrintStream("./log.txt");
			//分配了输出流
			System.setOut(pStream);	
			int age = 18;
			System.out.println("age 18");
			String  sex ="woman";
			System.out.println("sex woman");
			String info = "age 18 and sex woman ";
			//再分配回控制台
			System.setOut(out);
			System.out.println("program over");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
