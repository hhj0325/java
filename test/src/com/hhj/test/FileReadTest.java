package com.hhj.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("hhj.txt")){
			char[] cbuff = new char[32];
			int hasRead = 0;
			while((hasRead = fr.read(cbuff)) > 0){
				System.out.println(new String(cbuff,0,hasRead));	
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
