package com.hhj.test.weather;

import java.util.ArrayList;

public class WeatherData implements Subject {
	public ArrayList<Observer> observers;
	
	private float temp ;
	private float humidty;
	private float press;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}

	}

	@Override
	public void notifyObserver() {
		for(Observer tmp : observers){
			tmp.update(temp, humidty, press);
		}
	}
	
	public void mesurementChanged(){
		notifyObserver();
	}
	
	public void setMesurement(float temp ,float humidty , float press){
		this.temp = temp;
		this.humidty = humidty;
		this.press = press;
		mesurementChanged();
		
	}
	

}
