package com.hhj.test;
/**
 * 生成产品信息
 * @author huhaojian
 *
 */

public class ProductString {
	public static void main(String[] args){
		
		String pcode = "326658";
		int a = pcode.length();
		
		String pname = "数字基本包";
		int b = pname.length() * 2;
		
		String stime = "20140121";
		
		
		String month =  "1 ";
		
		String money = "25.00";
		int c = money.length();
		
		String total = "";
		
		for(int i = 0 ; i < 16 - a;i++){
			pcode += " " ;
			
		}
		
		for(int i = 0 ; i < 64 - b;i++){
			pname += " ";
			
		}
		
		for(int i = 0 ; i < 13 - c;i++){
			money += " ";
			
		}
		money += "|end";
		
		total = pcode + pname + stime + month + money;
		
		System.out.println(total);
	}

}
