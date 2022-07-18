package dp._3_structuralPatterns._1_adapter.code;

import java.util.HashMap;
import java.util.Map;

/**
 * DO NOT EDIT!
 * 
 * @author mibejm
 */
public class ImperialWeatherAPIImpl implements ImperialWeatherAPI {

	private static final Map<String, ImperialWeatherConditions> CONDITIONS;
    static {
    	CONDITIONS = new HashMap<>();
    	CONDITIONS.put("Wroclaw", new ImperialWeatherConditions(68.0, 2.0, 0.2));
    	CONDITIONS.put("Cairo", new ImperialWeatherConditions(104.0, 0.0, 0.01));
    	CONDITIONS.put("Yakutsk", new ImperialWeatherConditions(-58.0, 10.0, 0.646));
    }
	
	@Override
	public double getTemperatureInFahrenheit(String location) {
		ImperialWeatherConditions conditions = CONDITIONS.get(location);
		if (conditions != null) {
			return conditions.getTemperature();
		}
		throw new RuntimeException("Location not found");
	}

	@Override
	public double getWindSpeedInMilesPerHour(String location) {
		ImperialWeatherConditions conditions = CONDITIONS.get(location);
		if (conditions != null) {
			return conditions.getWindSpeed();
		}
		throw new RuntimeException("Location not found");
	}

	@Override
	public double getHumidity(String location) {
		ImperialWeatherConditions conditions = CONDITIONS.get(location);
		if (conditions != null) {
			return conditions.getHumidity();
		}
		throw new RuntimeException("Location not found");
	}

}
