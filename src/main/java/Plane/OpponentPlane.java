package Plane;

import FlyBehavior.FlyWithEngine;
import FlyBehavior.FlyWithWings;

public class OpponentPlane extends Plane{
    public OpponentPlane() {
        super(new FlyWithEngine());
    }

    @Override
    public void display() {
        System.out.println("敌机 出现");
    }

}
