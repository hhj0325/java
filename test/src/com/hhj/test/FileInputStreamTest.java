package com.hhj.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("hhj.txt");
		byte[] bbuf = new byte[22];
		int hasRead = 0;
		while((hasRead = fis.read(bbuf) )> 0){
			System.out.println(new String(bbuf , 0 , hasRead));
		}
		fis.close();
		
	}

}
