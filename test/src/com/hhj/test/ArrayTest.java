package com.hhj.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		List<ClassTest> slist = new ArrayList<ClassTest>();
		addfields(slist);
		for(ClassTest tmp : slist){
			System.out.println(tmp.str);
		}
		
	}
	public static void addfields(List<ClassTest> slist){
		ClassTest tmp = new ClassTest();
		tmp.str="123";
		slist.add(tmp);
		tmp.str="456";
		slist.add(tmp);
		
	}

}
