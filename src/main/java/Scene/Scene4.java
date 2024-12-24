package Scene;

import Figure.Boy;
import Figure.Girl;
import FlyBehavior.FlyWithWings;
import Plane.Plane;
import WalkBehavior.RunToHouse;
import Weather.Weather;

public class Scene4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("场景4：室内避难");
        Thread.sleep(1000);

        Weather w = new Weather();
        Plane p = new Plane(new FlyWithWings());
        Boy boy = new Boy(w,p);
        Girl girl = new Girl(w,p);
        Thread.sleep(1000);
        p.setFlyState("坠机了");
        Thread.sleep(1000);
        boy.setWalk(new RunToHouse());
        girl.setWalk(new RunToHouse());
    }
}
