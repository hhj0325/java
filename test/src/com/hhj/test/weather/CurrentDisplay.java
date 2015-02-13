package com.hhj.test.weather;

public class CurrentDisplay implements Display,Observer  {
	private float temp ;
	private float humidty;
	private Subject weatherData;
	
	public CurrentDisplay( Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void update(float temp, float humip, float press) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidty = humip;
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current display temp "+this.temp+", humidty "+this.humidty);

	}
}
