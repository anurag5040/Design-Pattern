package ObserverDesignPattern;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();

        Observer tvDisplay=new TvDisplay();
        Observer phoneDisplay=new PhoneDisplay();

        weatherStation.addObserver(tvDisplay);
        weatherStation.addObserver(phoneDisplay);

        weatherStation.setWeather("sunny");
    }
}
