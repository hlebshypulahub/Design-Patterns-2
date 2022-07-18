package dp._3_structuralPatterns._1_adapter.code;

/**
 * DO NOT EDIT!
 * 
 * @author mibejm
 */
public interface ImperialWeatherAPI {
	
	/**
	 * Gets the temperature in Fahrenheit degrees for given location.
	 * 
	 * @param location location.
	 * @return temperature in Fahrenheit degrees.
	 */
	public double getTemperatureInFahrenheit(String location);
	
	/**
	 * Gets the wind speed in miles per hour for given location.
	 * 
	 * @param location location.
	 * @return wind speed in miles per hour.
	 */
	public double getWindSpeedInMilesPerHour(String location);
	
	/**
	 * Gets humidity for given location - the returned value is in range [0, 1].
	 * 
	 * @param location location.
	 * @return humidity for given location - the returned value is in range [0, 1]
	 */
	public double getHumidity(String location);
}
