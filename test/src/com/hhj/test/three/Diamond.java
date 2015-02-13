package com.hhj.test.three;
/**
 * 输出菱形
 * @author huhaojian
 *
 */

public class Diamond {

	public static void main(String[] args) {
		printHollowRhombus(7);

	}
	public static void  printHollowRhombus(int size) {
		//画不出偶数行的菱形
		if (size % 2 == 0) {
			size++;
		}
		//上半部分
		for(int i = 0 ; i < size /2 + 1 ; i++){
			for (int j = size/2 + 1	; j > i + 1	; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i+1; j++) {
				if(j == 0 || j == 2 * i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//输出下半部分
		for(int i = size /2 + 1 ; i < size ; i ++){
			for (int j = 0; j < i - size/2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*size -1-2*i; j++) {
				if (j == 0 || j == 2 *(size-i-1)) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
