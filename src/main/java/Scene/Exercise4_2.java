package Scene;

import Figure.*;
import FlyBehavior.FlyWithEngine;
import FlyBehavior.FlyWithWings;
import Plane.*;
import WalkBehavior.WalkOnTheGround;
import Weather.Weather;

public class Exercise4_2 {
    public static void main(String[] args) {
        try {
            System.out.println("\n场景2（Cold）：");
            Thread.sleep(1000);

            Weather w = new Weather();
            Plane p = new Plane(new FlyWithEngine());
            Boy boy = new Boy(w,p);
            boy.display();
            Thread.sleep(1000);

            Girl girl = new Girl(w,p);
            girl.display();
            Thread.sleep(1000);

            boy.performWalk(new WalkOnTheGround());
            girl.performWalk(new WalkOnTheGround());
            Thread.sleep(1000);

            Boeing boeing = new Boeing();
            boeing.display();
            Thread.sleep(1000);

            Apache apache = new Apache();
            apache.display();
            Thread.sleep(1000);

            boeing.performFly();
            Thread.sleep(1000);

            apache.performFly();
        } catch (InterruptedException e) {
            System.out.println("线程被中断");
            e.printStackTrace();
        }
    }
}