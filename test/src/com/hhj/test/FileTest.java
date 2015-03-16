package com.hhj.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException{
		File dir = new File(".");
//		File file = File.createTempFile("hhj", ".txt",dir);
//		System.out.println(file.getName());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getParent());
//		file.deleteOnExit();
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("检查文件是否存在:"+newFile.exists());
		newFile.createNewFile();
		newFile.mkdir();
		String[] dirList = dir.list();
		System.out.println("=======当前目录和路径为=========");
		for(String fileName :dirList){
			System.out.println(fileName);
		}
		
		File[] roots = File.listRoots();
		System.out.println("=========系统根目录==========");
		for(File root:roots){
			System.out.println(root);
		}
		
		
	}

}
