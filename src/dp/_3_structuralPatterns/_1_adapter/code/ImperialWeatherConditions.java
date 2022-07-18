package dp._3_structuralPatterns._1_adapter.code;

public class ImperialWeatherConditions {

	private double temperature;
	private double windSpeed;
	private double humidity;
	
	public ImperialWeatherConditions(double temperature, double windSpeed, double humidity) {
		super();
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.humidity = humidity;
	}

	public double getTemperature() {
		return temperature;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public double getHumidity() {
		return humidity;
	}
}
