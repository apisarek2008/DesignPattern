package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	// Display element shows current measurements from WeatherData object
	private float temp;
	private float humid;
	private Subject weatherData;
	
	
	public CurrentConditionsDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void update(float temp, float humid, float press) {
		this.temp = temp;
		this.humid = humid;
		display();
	}
	
	public void display() {
		// display current measurement
		System.out.println("Current conditions " + temp + " Celsiusz. Humidity " + humid + " % humidity.");
		
	}
}
