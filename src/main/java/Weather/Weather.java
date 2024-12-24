package Weather;

import Figure.PlaneObserver;
import Figure.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class Weather implements WeatherSubject {
    String weather = "";
    private List<WeatherObserver> observers = new ArrayList<>();

    public void attach(WeatherObserver observer) {
        observers.add(observer);
    }

    public void detach(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.updateWeather(weather);
        }
    }

    public void setWeather(String weather) {
        this.weather = weather;
        System.out.println("天气将要来临："+weather);
        notifyObservers();
    }
}
