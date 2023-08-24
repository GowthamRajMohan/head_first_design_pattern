package io.smacs.weatherstation;

public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
