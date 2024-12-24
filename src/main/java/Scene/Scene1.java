package Scene;

import Duck.*;
import Figure.*;
import FlyBehavior.*;

public class Scene1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景1（Hot）：");
        Thread.sleep(1000);

        Hunter hunter = new Hunter();
        hunter.display();
        Thread.sleep(1000);

        hunter.walk();
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