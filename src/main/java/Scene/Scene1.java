package Scene;

import Figure.Boy;
import Figure.Girl;
import FlyBehavior.FlyWithEngine;
import FlyBehavior.FlyWithWings;
import Plane.Plane;
import Plane.PlaneSubject;
import Weather.Weather;
import Weather.WeatherSubject;

public class Scene1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景1：天气变化");
        Thread.sleep(1000);

        Weather w = new Weather();
        Plane p = new Plane(new FlyWithEngine());
        Boy boy = new Boy(w,p);
        Girl girl = new Girl(w,p);
        w.setWeather("暴风雨");
        Thread.sleep(1000);
    }
}
