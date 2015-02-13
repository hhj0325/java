package com.hhj.test.three;

import javax.swing.JWindow;

/**
 * 杨辉三角
 * @author huhaojian
 *
 */
public class YanghuiTriangle {

	public static void main(String[] args) {
		int triangle[][] = new int[10][];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i+1];
			for (int j = 0; j < i; j++) {
				//两边置为1
				if (i == 0 || j == 0 || i == j) {
					triangle[i][j] = 1;
				}
				//上一行前面加后面。
				else{
					triangle[i][j] = triangle[i -1][j] + triangle[i -1][j-1];
				}
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}
