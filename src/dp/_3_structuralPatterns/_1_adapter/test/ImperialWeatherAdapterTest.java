package dp._3_structuralPatterns._1_adapter.test;

import static org.junit.Assert.assertEquals;

import dp._3_structuralPatterns._1_adapter.code.ImperialWeatherAdapter;
import org.junit.Test;

import dp._3_structuralPatterns._1_adapter.code.ImperialWeatherAPIImpl;
import dp._3_structuralPatterns._1_adapter.code.MetricalWeatherService;

/**
 * TASK 3.1 - if the adapter was implemented correctly all these tests should pass
 * 
 * @author mibejm
 *
 */
public class ImperialWeatherAdapterTest {

	// TASK 3.1 - create a metrical weather service using an adapter
	private MetricalWeatherService weatherService
		= new ImperialWeatherAdapter(new ImperialWeatherAPIImpl());
	
	private static final double epsilon = 0.001;
	
	@Test
	public void shouldGetTemeperatureForWroclaw() {
		// given
		String location = "Wroclaw";
		
		// when
		double temperature = weatherService.getTemperatureInCelsius(location);

		// then
		assertEquals(20.0, temperature, epsilon);
	}
	
	@Test
	public void shouldGetWindSpeedForWroclaw() {
		// given
		String location = "Wroclaw";
		
		// when
		double windSpeed = weatherService.getWindSpeedInKilometersPerHour(location);

		// then
		assertEquals(3.22, windSpeed, epsilon);
	}
	
	@Test
	public void shouldGetHumidityForWroclaw() {
		// given
		String location = "Wroclaw";
		
		// when
		int humidity = weatherService.getHumidity(location);

		// then
		assertEquals(20, humidity);
	}
	
	@Test
	public void shouldGetTemeperatureForCairo() {
		// given
		String location = "Cairo";
		
		// when
		double temperature = weatherService.getTemperatureInCelsius(location);

		// then
		assertEquals(40.0, temperature, epsilon);
	}
	
	@Test
	public void shouldGetWindSpeedForCairo() {
		// given
		String location = "Cairo";
		
		// when
		double windSpeed = weatherService.getWindSpeedInKilometersPerHour(location);

		// then
		assertEquals(0.0, windSpeed, epsilon);
	}
	
	@Test
	public void shouldGetHumidityForCairo() {
		// given
		String location = "Cairo";
		
		// when
		int humidity = weatherService.getHumidity(location);

		// then
		assertEquals(1, humidity);
	}
	
	@Test
	public void shouldGetTemeperatureForYakutsk() {
		// given
		String location = "Yakutsk";
		
		// when
		double temperature = weatherService.getTemperatureInCelsius(location);

		// then
		assertEquals(-50.0, temperature, epsilon);
	}
	
	@Test
	public void shouldGetWindSpeedForYakutsk() {
		// given
		String location = "Yakutsk";
		
		// when
		double windSpeed = weatherService.getWindSpeedInKilometersPerHour(location);

		// then
		assertEquals(16.1, windSpeed, epsilon);
	}
	
	@Test
	public void shouldGetHumidityForYakutsk() {
		// given
		String location = "Yakutsk";
		
		// when
		int humidity = weatherService.getHumidity(location);

		// then
		assertEquals(65, humidity);
	}
}
