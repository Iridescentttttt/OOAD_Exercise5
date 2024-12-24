package Scene;

import Figure.Boy;
import Figure.*;
import Figure.Girl;
import FlyBehavior.FlyWithWings;
import Plane.Plane;
import Weather.Weather;

public class Scene5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景5：喷气背包的发明");
        Thread.sleep(1000);

        Weather w = new Weather();
        Plane p = new Plane(new FlyWithWings());
        Boy boy = new Boy(w,p);
        Girl girl = new Girl(w,p);
        System.out.println("在屋内，他们发现了最新发明的喷气背包");

        Thread.sleep(1000);
        Figure boywithjetpack = new JetPackDecorator(boy,w,p);
        Figure girlwithjetpack = new JetPackDecorator(girl,w,p);

    }
}
