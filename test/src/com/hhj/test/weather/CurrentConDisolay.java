package com.hhj.test.weather;

import java.util.Observable;
import java.util.Observer;

public class CurrentConDisolay implements Observer {
	Observable observable;
	private float temperature;
	private float humidity ;
	
	public CurrentConDisolay (	Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDatab){
			WeatherDatab weatherData = (WeatherDatab) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display(){
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

}
