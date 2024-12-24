package Figure;

import FlyBehavior.FlyWithJetpack;
import Plane.PlaneSubject;
import Weather.WeatherSubject;

public class JetPackDecorator extends FigureDecorator{

    public JetPackDecorator(Figure f, WeatherSubject w, PlaneSubject p) {
        super(f,w,p);
        this.setFlyBehavior(f,new FlyWithJetpack());
    }

    @Override
    public void dressedIn(){
        System.out.println("穿戴着飞行背包");
    }
}
