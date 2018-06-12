package observer;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements (80, 40,998);
		weatherData.setMeasurements(23, 66, 1000);
		weatherData.setMeasurements(40, 40, 950);
		
	}

}
