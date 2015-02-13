package com.hhj.test;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		String[] nameList = file.list(new MyFilenameFilter());
		for(String name : nameList){
			System.out.println(name);
		}
		
	}

}

class MyFilenameFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".java") || new File(name).isDirectory();
	}
	
}
