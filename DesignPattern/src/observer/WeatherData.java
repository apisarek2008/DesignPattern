package observer;

import java.util.ArrayList;


public class WeatherData implements Subject{
	private float temp;
	private float humid;
	private float press;
	private ArrayList observers;
	
		public WeatherData() {
		observers = new ArrayList();
	}
	
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
		
	public void removeObserver(Observer o) {
		// If observers wants to be un-registered we just take it off from the list
		int i = observers.indexOf(o);
		if (i>=0) {
			observers.remove(i);
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humid, float press) {
		// 
		this.temp = temp;
		this.humid = humid;
		this.press = press;
		measurementChanged();
	}

	public float getTemperature() {
		this.temp = temp;
		return temp;
	}
	
	public float getHumidity() {
		
		this.humid = humid;
		return humid;
	}
	public float getPressure() {
		this.press = press;
		return press;
	}

	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temp, humid, press);
		
	}

	}
}
