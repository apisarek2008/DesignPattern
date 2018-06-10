package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	// Display element shows current measurements from WeatherData object
	private float temp;
	private float hum;
	private Subject weatherData;
	
	public void update(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.hum = humidity;
	}	
	
	public CurrentConditionsDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		// display current measurement
		System.out.println("Current conditions: " + temp + " F degrees " + hum + " % humidity.");
	}
}
