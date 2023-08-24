package io.smacs.weatherstation;

public class CurrentConditionsDisplay implements Observer, DisplayElements{

    private float temperature;
    private float humidity;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+ temperature + "F degrees and "+ humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
