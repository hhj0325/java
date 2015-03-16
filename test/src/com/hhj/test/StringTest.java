package com.hhj.test;

import java.text.DecimalFormat;

public class StringTest {
	public static void main(String[] args) {
		float scale = 0f;
		DecimalFormat fnum = new DecimalFormat("##0.00");
		scale = Float.parseFloat(fnum.format(scale));
		System.out.println(fnum.format(scale));

	}

}
