package dp._3_structuralPatterns._1_adapter.code;

public class ImperialWeatherAdapter implements MetricalWeatherService {

    private final ImperialWeatherAPIImpl imperialWeatherAPI;

    public ImperialWeatherAdapter(ImperialWeatherAPIImpl imperialWeatherAPI) {
        this.imperialWeatherAPI = imperialWeatherAPI;
    }

    @Override
    public double getTemperatureInCelsius(String location) {
        return (imperialWeatherAPI.getTemperatureInFahrenheit(location) - 32) / 1.8;
    }

    @Override
    public double getWindSpeedInKilometersPerHour(String location) {
        return imperialWeatherAPI.getWindSpeedInMilesPerHour(location) * 1.61;
    }

    @Override
    public int getHumidity(String location) {
        System.out.println(imperialWeatherAPI.getHumidity(location));
        return (int) Math.round(imperialWeatherAPI.getHumidity(location) * 100);
    }
}
