package observer;

public class ForecastDisplay implements Observer, DisplayElement {
	private float lastPress;
	private float currentPress = 1080;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void update(float temp, float humid, float press) {
		lastPress = currentPress;
		currentPress = press;
	}
	
	public void display() {
		
	}

}
