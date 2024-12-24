package Plane;

import FlyBehavior.FlyWithEngine;
import FlyBehavior.FlyWithWings;

public class AirBus extends Plane{
    public AirBus() {
        super(new FlyWithEngine());
    }

    @Override
    public void display() {
        System.out.println("AirBus 出现");
    }
}
