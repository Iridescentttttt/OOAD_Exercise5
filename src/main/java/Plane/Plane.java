package Plane;

import FlyBehavior.*;
import Figure.PlaneObserver;
import Weather.WeatherSubject;

import java.util.ArrayList;
import java.util.List;

public class Plane implements PlaneSubject {
    private List<PlaneObserver> observers = new ArrayList<>();
    private FlyBehavior flyBehavior;
    private String flyState = "";

    public Plane(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void display(){};

    public void performFly() {
        flyBehavior.fly(this.getClass().getSimpleName());
    }

    public void attach(PlaneObserver observer) {
        observers.add(observer);
    }

    public void detach(PlaneObserver observer) {
        observers.remove(observer);
    }

    public void setFlyState(String s){
        flyState = s;
        System.out.println("天空中发生了异常："+s);
        notifyObservers();
    }

    public void setFlyBehavior(FlyBehavior f){
        flyBehavior = f;
    }
    public void notifyObservers() {
        for (PlaneObserver observer : observers) {
            observer.updatePlane(flyState);
        }
    }

    public void shoot(){
        System.out.println(this.getClass().getSimpleName()+" 进行了射击");
    }

}