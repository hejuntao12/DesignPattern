package observe;

import observe.impl.CurrentConditionsDisplay;
import observe.impl.WeatherData;

public class WeatherStation {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay c = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(82, 80, 28.1f);
		weatherData.setMeasurements(90, 75, 27.5f);
	}
}
