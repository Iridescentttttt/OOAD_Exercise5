package Figure;

import FlyBehavior.FlyBehavior;
import Plane.PlaneSubject;
import WalkBehavior.*;
import WearClothes.*;
import Weather.WeatherSubject;

import javax.security.auth.Subject;

public abstract class Figure implements PlaneObserver,WeatherObserver {
    protected WearClothes wearClothes = new WearShirts();
    private WeatherSubject weatherSubject;
    private PlaneSubject planeSubject;
    private String planeState;
    private String weatherState;
    private WalkBehavior walkBehavior;
    private FlyBehavior flyBehavior;

//    public Figure(WearClothes wearClothes){this.wearClothes = wearClothes;}
    public Figure(WeatherSubject w, PlaneSubject p){
        this.weatherSubject = w;
        this.planeSubject = p;
        w.attach(this);
        p.attach(this);
    }

    public void display(){};
    public void dressedIn(){};

//    public void walk() {
//        System.out.println(this.getClass().getSimpleName() + " 在地面走路");
//    }

    public void updateWeather(String s){
        weatherState = s;
        if(s.equals("暴风雨")){
            wearClothes = new WearRaincoat();
            wearClothes.dressedIn(this.getClass().getSimpleName());
            wearClothes = new WearWaterproofShoes();
            wearClothes.dressedIn(this.getClass().getSimpleName());
        }
    };

    public void updatePlane(String s){
        planeState = s;
        if(s.equals("天空异常")){
            walkBehavior = new RunToHouse();
        }
    };

    public void setWear(WearClothes w){
        this.wearClothes = w;
    }

    public void performWear(WearClothes w){
        w.dressedIn(this.getClass().getSimpleName());
    }

    public void setWalk(WalkBehavior w){
        this.walkBehavior = w;
        w.walk(this.getClass().getSimpleName());
    }

    public void performWalk(WalkBehavior w){
        w.walk(this.getClass().getSimpleName());
    }

    public void setFlyBehavior(Figure f,FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        flyBehavior.fly(f.getClass().getSimpleName());
    }

    public void performFly(FlyBehavior f) {
        f.fly(this.getClass().getSimpleName());
    }
}