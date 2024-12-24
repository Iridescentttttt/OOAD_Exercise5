package Weather;

import Figure.PlaneObserver;
import Figure.WeatherObserver;

public interface WeatherSubject {
    public void attach(WeatherObserver observer);

    public void detach(WeatherObserver observer);

    public void notifyObservers();
}

