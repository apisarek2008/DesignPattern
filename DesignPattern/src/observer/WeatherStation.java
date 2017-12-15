package observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 20, 1020);
		weatherData.setMeasurements(82, 60, 880);
		weatherData.setMeasurements(20, 10, 550);
	}

}
