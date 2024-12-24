package Scene;

import FlyBehavior.Fall;
import FlyBehavior.FlyWithEngine;
import Plane.*;

public class Scene3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景3：飞机的互动");
        Thread.sleep(1000);

        Apache a = new Apache();
        Boeing b = new Boeing();
        a.performFly();
        b.performFly();

        Thread.sleep(1000);

        OpponentPlane o = new OpponentPlane();
        o.performFly();

        Thread.sleep(1000);

        a.shoot();

        Thread.sleep(1000);

        o.setFlyBehavior(new Fall());
        o.performFly();
    }
}
