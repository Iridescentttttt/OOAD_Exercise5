package Scene;

import Duck.*;
import Figure.*;
import FlyBehavior.*;
import Plane.Plane;
import WalkBehavior.WalkOnTheGround;
import Weather.Weather;

public class Exercise4_1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景1（Hot）：");
        Thread.sleep(1000);

        Weather w = new Weather();
        Plane p = new Plane(new FlyWithWings());
        Hunter hunter = new Hunter(w,p);
        hunter.display();
        Thread.sleep(1000);

        hunter.performWalk(new WalkOnTheGround());
        Thread.sleep(1000);

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        Thread.sleep(1000);

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        Thread.sleep(1000);

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        Thread.sleep(1000);

        mallardDuck.swim();
        redHeadDuck.swim();
        rubberDuck.swim();
        Thread.sleep(1000);

        mallardDuck.performFly();
        Thread.sleep(2000);

        hunter.shoot();
        mallardDuck.setFlyBehavior(new Fall());
        mallardDuck.performFly();
        mallardDuck.die();
    }
}