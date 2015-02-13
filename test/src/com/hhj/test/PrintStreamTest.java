package com.hhj.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
			FileOutputStream fos = new FileOutputStream("hhj.txt");
			PrintStream ps = new PrintStream(fos)){
			ps.println("普通字符串");
			ps.println(new PrintStreamTest());
			FileReader fr = new FileReader("hhj.txt");
			char[] hh = new char[32];
			System.out.println(hh);
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
