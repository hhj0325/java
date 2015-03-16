package com.hhj.test.weather;

public class WeatherStation {
	public static void main(String[] args)	{
		WeatherData weatherData = new WeatherData();
		CurrentDisplay cdisplay = new CurrentDisplay(weatherData);
		weatherData.setMesurement(80, 60, 30f);
		weatherData.setMesurement(10, 20, 30f);
		weatherData.setMesurement(30, 20, 30f);
	}

}
