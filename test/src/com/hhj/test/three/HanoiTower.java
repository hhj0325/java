package com.hhj.test.three;

import java.util.Scanner;
/**
 * 汉诺塔
 * @author huhaojian
 *
 */

public class HanoiTower {
	
	public static void moveDish(int level ,char from ,char inter ,char to) {
		if (level == 1) {
			System.out.println("从"+from	+"移动盘子1号到"+to);
		}
		else{
			moveDish(level-1, from, to, inter);
			System.out.println("从"+from	+"移动盘子"+level+"号到"+to);
			moveDish(level-1, inter, from, to);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nDisks = (int)scanner.nextLong();
		moveDish(nDisks, 'A', 'B', 'C');

	}
	
	public String toString() {
		return "HanoiTower";
	}
	
	public int  hashCode() {
		return 1234;
	}

}
