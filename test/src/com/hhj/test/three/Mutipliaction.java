package com.hhj.test.three;
/**
 * 九九乘法表
 * @author huhaojian
 *
 */
public class Mutipliaction {

	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j +"*"+ i + " = " + (i*j ) + "\t");
			}
			System.out.println();
		}

	}

}
