package com.hhj.test.coffee;
/**
 * 饮料
 * @author huhaojian
 *
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
