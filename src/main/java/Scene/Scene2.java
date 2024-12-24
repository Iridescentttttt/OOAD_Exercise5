package Scene;

import Duck.MallardDuck;
import Figure.Boy;
import Figure.Girl;
import Figure.Hunter;
import FlyBehavior.Fall;
import FlyBehavior.FlyWithEngine;
import FlyBehavior.FlyWithWings;
import Plane.Plane;
import WalkBehavior.WalkOnTheGround;
import Weather.Weather;

public class Scene2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景2：鸭子的生态循环");
        Thread.sleep(1000);

        Weather w = new Weather();
        Plane p = new Plane(new FlyWithEngine());
        Boy boy = new Boy(w,p);
        Girl girl = new Girl(w,p);
        w.setWeather("暴风雨来临之前");
        Thread.sleep(1000);

        Hunter hunter = new Hunter(w,p);
        hunter.display();
        Thread.sleep(1000);

        hunter.performWalk(new WalkOnTheGround());
        Thread.sleep(1000);

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        Thread.sleep(1000);

        mallardDuck.swim();
        Thread.sleep(1000);

        mallardDuck.performFly();
        Thread.sleep(2000);

        hunter.shoot();
        mallardDuck.setFlyBehavior(new Fall());
        mallardDuck.performFly();
        mallardDuck.die();

        Thread.sleep(2000);
        mallardDuck.revive();
    }
}
