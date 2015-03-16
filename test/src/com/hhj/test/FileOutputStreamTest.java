package com.hhj.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
			FileInputStream fis = new FileInputStream("hhj.txt");
			FileOutputStream fos = new FileOutputStream("lrl.txt")
			){
			byte[] buff = new byte[32];
			int hasRead = 0;
			while((hasRead = fis.read(buff)) > 0){
				fos.write(buff, 0, hasRead);
			}
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
