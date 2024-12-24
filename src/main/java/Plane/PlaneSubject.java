package Plane;

import Figure.PlaneObserver;

public interface PlaneSubject {
    public void attach(PlaneObserver observer);

    public void detach(PlaneObserver observer);

    public void notifyObservers();
}

