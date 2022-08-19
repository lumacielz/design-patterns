package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float tenperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = (Observer) observers.get(i);
            obs.update(tenperature, humidity, pressure);
        }
    }

    public void setMeasurements(float tenperature, float humidity, float pressure) {
        this.tenperature = tenperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
