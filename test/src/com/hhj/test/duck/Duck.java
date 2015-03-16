package com.hhj.test.duck;

public class Duck {
	private FlyBehavior fb ;
	
	public void perfly(){
		fb.fly();
	}
	
	public static void main(String[] args){
		Duck test = new Duck();
		test.fb = new FlyWithWings();
		test.perfly();
	}

}
