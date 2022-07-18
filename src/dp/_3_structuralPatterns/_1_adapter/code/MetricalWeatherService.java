package dp._3_structuralPatterns._1_adapter.code;

/**
 * 
 * TASK 3.1 - The implementation of the {@link MetricalWeatherService} is called
 * on the Client side for retrieving the Data about weather conditions. However, the API 
 * that may be used for this task was developed for getting a data in imperial system, whereas
 * the Client expects the metrical system. Moreover the service for finding humidity has other return type.
 * Implement the adapter to convert the weather interface into expected one.
 * Read java-docs for more details
 * 
 * HINT 1: Fahrenheit to Celsius : ('F - 32) / 1.8 = 'C
 * HINT 2: 1 MPH = 1.61 KMpH
 * 
 * @author mibejm
 *
 */
public interface MetricalWeatherService {

	/**
	 * Gets the temperature in Celsius degrees for given location.
	 * 
	 * @param location location.
	 * @return temperature in Celsius degrees.
	 */
	public double getTemperatureInCelsius(String location);
	
	/**
	 * Gets the wind speed in kms per hour for given location.
	 * 
	 * @param location location.
	 * @return wind speed in kms per hour.
	 */
	public double getWindSpeedInKilometersPerHour(String location);
	
	/**
	 * Gets humidity for given location - the returned value is in range [0, 100].
	 * 
	 * @param location location.
	 * @return humidity for given location - the returned value is in range [0, 100]
	 */
	public int getHumidity(String location);
}
