package com.hhj.test.three;

import java.util.Scanner;

/**
 * 判断是否是闰年
 * @author huhaojian
 *
 */
public class Fouryears {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		long year ;
		try {
			year = scanner.nextLong();
			if((year % 4 == 0 && year % 100 != 0)
					|| (year % 400 == 0)){
				System.out.println(year + "是闰年");
			}
			else{
				System.out.println(year + "不是闰年");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print("输入有误");
		}
	}
}
